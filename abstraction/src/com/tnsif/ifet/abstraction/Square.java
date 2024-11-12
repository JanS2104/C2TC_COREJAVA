package com.tnsif.ifet.abstraction;

public class Square extends Shape {
private float side;
	
	public Square() {
		this.side = 5.0f;
	}
	
	public Square(float side) {
		this.side = side;
		
	}
	
	@Override
	public void calArea() {
		area = side*side;
	}
}
