package com.tns.ifet.daythree;

public class CustDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 =  new Customer();
		Customer c2 =  new Customer();
		Customer c3 =  new Customer();
		Customer c4 =  new Customer();
		Customer c5 =  new Customer();
		
		c1.setCid(01);
		c1.setCaddress("21, 3rd cross street");
		c1.setCname("Janani");
		c1.setCity("Cuddalore");
		
		c2.setCid(02);
		c2.setCaddress("15A, 2nd cross street");
		c2.setCname("Krishh");
		c2.setCity("Chennai");
		
		c3.setCid(03);
		c3.setCaddress("29A, 3rd cross street");
		c3.setCname("Jayrus");
		c3.setCity("Bangalore");
		
		c4.setCid(04);
		c4.setCaddress("18B, 3rd cross street");
		c4.setCname("April");
		c4.setCity("Cuddalore");
		
		c5.setCid(05);
		c5.setCaddress("45V , 3rd cross street");
		c5.setCname("Summer");
		c5.setCity("Bangalore");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}

}
