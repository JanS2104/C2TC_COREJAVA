package com.providence.shoppingmall.impl_ordering;
import com.providence.shoppingmall.interfacesample.*;

public class ComputerTools implements Order {
	private static ComputerTools computertools = new ComputerTools();

	public static ComputerTools getComputertools() {
		return computertools;
	}

//	public static void setComputertools(ComputerTools computertools) {
//		ComputerTools.computertools = computertools;
//	}
	
//	public ComputerTools() {
//		
//	}
	
	public void ordering() {
		System.out.println("I am buying a computer hard disk");
	}

}
