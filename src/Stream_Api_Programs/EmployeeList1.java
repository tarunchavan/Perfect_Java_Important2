package Stream_Api_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeList1 {

	public static void main(String[] args) {

		List<Employee1> employeeList = new ArrayList<Employee1>();
		employeeList.add(new Employee1(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee1(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee1(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee1(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee1(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee1(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee1(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee1(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee1(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee1(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee1(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee1(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee1(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee1(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee1(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee1(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// 1.How many male and female employee are there in the organization?

		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
        
        // 2. Print the name of all departments in the organization ?
        
        employeeList.stream()
        .map(Employee1::getDepartment)
        .distinct()
        .forEach(System.out::println);
        
        // 3.  what is the average age of male and female employees ?
        
         Map<String, Double> avgAgeOfMaleAndFemaleEmployees = 
        		 employeeList.stream()
        		 .collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
        
         System.out.println(avgAgeOfMaleAndFemaleEmployees);
         
         //4. Get the details of highest paid employees in the organization ?
         
         
         
         
         // 5. Get the names of all employees who have joined after 2015?
         
         employeeList.stream()
         .filter(e -> e.getYearOfJoining()>2015)
         .map(Employee1::getName)
         .forEach(System.out::println);
         
         //6. 
         //7.
         Map<String, Double> avgSalaryOfDepartments=
         employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.averagingDouble(Employee1::getSalary)));
         System.out.println(avgSalaryOfDepartments);
         
         //8.
         //9.
         //10. how many male and female employees are there in the sales and marketing team ?
         
         Map<String,Long> countMaleFemaleEmployeesInSalesMarketing= 
        		 employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing")
        		 .collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
         
         System.out.println(countMaleFemaleEmployeesInSalesMarketing);
         
         //11. 
         
	}
}
