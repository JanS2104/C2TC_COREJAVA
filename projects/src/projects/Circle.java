package projects;

public class Circle {
	
	int radius;
	String color;
	
	public void getInput(int radius, String color) {
		this.radius = radius;
		this.color = color;
	} 
	
	public void calcArea(int r) {
		System.out.println(3.14*r*r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.getInput(5, "green");
		c1.calcArea(c1.radius);

	}

}
