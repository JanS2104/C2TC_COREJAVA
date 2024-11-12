package com.providence.shoppingmall.impl_ordering;
import com.providence.shoppingmall.interfacesample.*;

public class MobileTools implements Order {
	private static MobileTools mobiletools = new MobileTools();

	public static MobileTools getMobiletools() {
		return mobiletools;
	}

//	public static void setMobiletools(MobileTools mobiletools) {
//		MobileTools.mobiletools = mobiletools;
//	}
	
//	public MobileTools() {
//		
//	}
	
	public void ordering() {
		System.out.println("I am buying a mobile harddisk");
	}
	
	

}
