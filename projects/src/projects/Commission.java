package projects;

public class Commission {
	String name;
	String address;
	long phone;
	long sales_amount;
	
	Commission(String name, String address, long phone, long sales_amount) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.sales_amount = sales_amount;
	}
	
	public void comm_rates(long sales_amount) {
		if (sales_amount >= 30000 && sales_amount < 50000) {
			System.out.println("commission = 3%");
			
		}
		
		else if(sales_amount >= 50000 && sales_amount < 100000) {
			System.out.println("commission = 5%");
		}
		
		else if(sales_amount >= 100000) {
			System.out.println("commission = 10%");
		}
		
		else {
			System.out.println("no commission");
		}
	}
	
	public static void main(String[] args) {
		Commission c1 = new Commission("jansan", "29A, 3rd cross, Manjakuppam", 6374763404l,210423l);
		c1.comm_rates(c1.sales_amount);
	}

}
