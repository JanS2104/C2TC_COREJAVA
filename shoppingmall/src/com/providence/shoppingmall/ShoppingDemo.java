package com.providence.shoppingmall;
import com.providence.shoppingmall.entity.Customer;
import com.providence.shoppingmall.impl_ordering.*;
import com.providence.shoppingmall.interfacesample.*;

public class ShoppingDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("JANANI");
		c1.setCity("Banglore");
		c1.setProduct("mobiletools");
		
		Order order;
		
		String choice = c1.getProduct();
		
		if(choice.equals("mobiletools"))
		{
			order = MobileTools.getMobiletools();
		}
		else
		{
			order = ComputerTools.getComputertools(); 
		}
		order.ordering();

	}

}
