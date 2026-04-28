package com.training;

public class Professor {

	private int id;
	private String firstName;
	private String qualification;
	private String department;
	private double salary;
	private Student stud; //professor has a student-composition
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int id, String firstName, String qualification, String department, double salary, Student stud) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.qualification = qualification;
		this.department = department;
		this.salary = salary;
		this.stud = stud;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	@Override
	public String toString() {
		return "Professor [id=" + id + ", firstName=" + firstName + ", qualification=" + qualification + ", department="
				+ department + ", salary=" + salary + ", stud=" + stud + "]";
	}
	
	
}


