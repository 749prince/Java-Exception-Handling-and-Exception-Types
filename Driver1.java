package com.kodewala.exception;

public class Driver1 {
	
	public static void main(String[] args) {
		
		Driver1 driver=new Driver1();
		driver.doSomething();
		
	}
	
	public void doSomething() {
		String name=null;
		int amount=100;
		
		try {
			amount=amount/0;
			System.out.println(name.length());
			System.out.println("Doing something  that is ignoredbecouse of exception");
		}
		catch(ArithmeticException e) {
			System.out.println("Number can not be divided by 0");
			e.printStackTrace();
			
		}
		catch(NullPointerException e) {
			System.out.println("name can not be null");
			e.printStackTrace();
		}
	}

}
