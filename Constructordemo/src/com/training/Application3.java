package com.training;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor professor1 = new Professor(350, "abc", "msc", "chem", 60000);
//		System.out.println(professor1.getId());
//		System.out.println(professor1.getFirstName());
//		System.out.println(professor1.getQualification());
//		System.out.println(professor1.getDepartment());
//		System.out.println(professor1.getSalary());
//	
		System.out.println(professor1);
		
	Professor professor2 = new Professor();
	professor2.setId(500);
	professor2.setFirstName("ram");
	professor2.setQualification("msc");
	professor2.setDepartment("chem");
	professor2.setSalary(60000);
	System.out.println(professor2.getId());
	System.out.println(professor2.getFirstName());
	System.out.println(professor2.getQualification());
	System.out.println(professor2.getDepartment());
	System.out.println(professor2.getSalary());
	
	}
	
	

}