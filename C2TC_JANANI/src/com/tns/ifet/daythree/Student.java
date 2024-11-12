package com.tns.ifet.daythree;

public class Student {
	private int age;
	private String name;
	private String city;
	
	public int getage()
	{
		return age;
	}
	public void setage(int age){
		this.age = age;
	}
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name = name;
	}
	public String  getcity()
	{
	   return city;	
	}
	public void setcity(String city){
		this.city = city;
	}
	
	public String toString() {
		return "Student [ age=" +age+" ,name="+name+" ,city ="+city+" ]";
	}

}
