package com.tns.ifet.daythree;
import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		String name = input.nextLine();
		String grade =input.nextLine();
		//input.nextLine();
		float cgpa = input.nextFloat();
		//input.nextLine();
		int rollno = input.nextInt();
		
		System.out.println(name);
		System.out.println(grade);
		System.out.println(rollno);
		System.out.println(cgpa);
		
		input.close();
		
		
		

	}

}
