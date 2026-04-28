package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student shruthi = new Student();
shruthi.setRollNumber(450);
shruthi.setStudentName("shruthi");
System.out.println(shruthi.getRollNumber());
System.out.println(shruthi.getStudentName());

Student john = new Student(100,"john");
System.out.println(john.getRollNumber());
System.out.println(john.getStudentName());
		
	}

}
