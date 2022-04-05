package com.wipro.automobile.ship;

public class Compartment {
	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}
}
