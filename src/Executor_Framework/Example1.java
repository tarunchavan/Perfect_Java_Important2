package Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {
	public static void main(String[] args) {

		// by traditional
//		for (int i = 0; i < 10; i++) {
//			Thread t1 = new Thread(new Task(i));
//			t1.start();
//		}

		// by executor
		ExecutorService ex = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 10; i++) {
			ex.execute(new Task(i));
		}
		ex.shutdown();
	}

}

class Task implements Runnable {

	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("Task " + taskId + " is running on thread:  " + Thread.currentThread().getName());

	}

}