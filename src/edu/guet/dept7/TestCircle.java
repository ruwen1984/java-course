package edu.guet.dept7;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle x = new Circle();
//		x.setRadius(8);
		System.out.println(x.getRadius());
		System.out.println(Circle.PI);
		Circle.PI = 3.14;
		System.out.println(x.PI);
		System.out.println(Circle.PI);
	}

}
