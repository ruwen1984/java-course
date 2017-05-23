package edu.guet.dept7;

public class IntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data1 = 10;
		int data2 = 20;
		
		Integer wrapper1 = new Integer(data1);
		Integer wrapper2 = new Integer(data2);
		
		System.out.println(data1 / 3);
		System.out.println(wrapper1.doubleValue() / 3);
		System.out.println(wrapper1.compareTo(wrapper2));
	}

}
