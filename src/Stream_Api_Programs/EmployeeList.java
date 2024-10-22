
/*
package Stream_Api_Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class EmployeeList {

	public static void main(String[] args) {
	
		List<Employee> employeeList=new ArrayList<Employee>();		
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0)); 
		
		
		//1. How many Male and Female employees are there in organization ?
		
		Map<String,Long> noOfMaleAndFemaleEmployees = 
				         employeeList.stream()
				         .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		//2. print the name of all department in the organization ?
		  
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		//3.  What is the average age of male and female employees ? 
		
		Map<String,Double> avgAgeOfMaleAndFemaleEmployees = 
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(avgAgeOfMaleAndFemaleEmployees);
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		
		//4. get the details of higher paid employee in the organizations 
		
	Optional<Employee> highestPaidEmployeeWrapper = 
			employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))) ;
	
	    Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
			System.out.println("Details of highest paid Employee: ");
			System.out.println("Name: "+highestPaidEmployee.getName());
			
 System.out.println("-------------------------------------------------------------------------");
 
 //5. Get the names of all employees who have joined after 2015::
  
 employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
 
 
 System.out.println("-------------------------------------------------------------------------");
 
 //6. Count the number of employees in each department :: 
// 
// Map<String, Long> employeeCountByDepartment =
// employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
// 
//     Set<Entry<String,Long>> entrySet = employeeCountByDepartment.entrySet();
//     for(Entry<String,Long> entry: entrySet) 
//     {
//    	System.out.println(entry.getKey()+" "+entry.getValue());
//     }
//     
  /*   
     // 7. What is the Average salary of each department
     
     Map<String,Double> avgSalaryOfDepartments = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee:: getSalary))) ;
     
     Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
     
     for (Entry<String, Double> entry : entrySet) 
     {
         System.out.println(entry.getKey()+" : "+entry.getValue());
     }
    
    System.out.println("7-done -------------------------------------------------------------------------");
    
    //8. Get the details of youngest male employee in the product development department?
    Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper= 
    employeeList.stream()
             .filter(e -> e.getGender()== "Male" && e.getDepartment()=="Product Development")
              .min(Comparator.comparingInt(Employee::getAge));
    
   Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
    
   System.out.println("----Details Of Youngest Male Employee In Product Development----");
  
   System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());
            
   System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());
            
   System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());
            
   System.out.println("Year Of Joinging : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
            
   System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());
    
   System.out.println("----------------------------------------------");
   
   //9. who has the most working experience in the organization 
   
   Optional<Employee> seniorMostEmployeeWrapper = 
   employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
   
  Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
   System.out.println("Senior Most Employee Details: ");
   System.out.println("Name : "+seniorMostEmployee.getName());
   
   System.out.println("----------------------------------------------");
   
   //10. How many male and female employees are there in the sales and marketing team ?
   
   Map<String,Long> countMaleFemaleEmployeesInSalesMarketing = 
		   employeeList.stream().filter(e -> e.getDepartment()=="Sales And Marketing")
		   .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())) ;
   
   System.out.println(countMaleFemaleEmployeesInSalesMarketing);
	
System.out.println("-----------------------------------------------------");

//11. What is the average salary of male and female employee

   Map<String,Double> avgSalaryOfMaleAndFemaleEmployees = 
		   employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))) ;

   System.out.println(avgSalaryOfMaleAndFemaleEmployees);

System.out.println("-----------------------------------------------------");

// Remaining::

//12. List down the names of all employees in each department 

*/