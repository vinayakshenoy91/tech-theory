package com.concurrency.forkjoin;

public class TestThreads {

	public static void main(String[] args) throws InterruptedException {
	

		  System.out.println(Thread.currentThread().getState());
		  
		  Runnable sayHello = ()->{
			  System.out.println("Hello");
		  };
		  
		  Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Bye");
				
			}
		});
		  
		  
		  Thread x = new Thread(sayHello);

		  System.out.println("After creation"+x.getState());
		  
		  x.start();
		  
		  System.out.println("After starting it"+ x.getState());
		  
		  
		  x.join();
		  
		  System.out.println("After starting it"+ x.getState());
	}
	

}
