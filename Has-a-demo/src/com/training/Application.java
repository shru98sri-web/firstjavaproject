package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram = new Student(40, "ram");
		Professor may =new Professor(101, "may", "phd", "arts", 50000, ram);
		
		System.out.println(may);
		
		Product prod = new Product(31, "soap", 45.00);
		Address address = new Address("S1", "Boopathy", "Chennai", "600117");

		Store nilgris = new Store(prod, 34, "Nilgris", address);
		System.out.println(nilgris);
				
	}

}
