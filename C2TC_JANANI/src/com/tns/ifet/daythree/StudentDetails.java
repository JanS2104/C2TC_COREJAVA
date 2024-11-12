package com.tns.ifet.daythree;

public class StudentDetails {
	String name;
	int rollno;
	char grade;
	float cgpa;
	
	public StudentDetails(String name,int rollno,char grade,float cgpa)
	{
		this.name =name;
		this.rollno = rollno;
		this.grade = grade;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno+ ", grade=" + grade + ",cgpa="+cgpa+"]";
	}
	
	
	
	public static void main(String[] args) {
		
		StudentDetails name = new StudentDetails("gandhi",42112,'A',8.1f);
		System.out.println(name);
		
		

	}

}
