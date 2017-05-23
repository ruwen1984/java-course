package edu.guet.dept7;

public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 200;
		Integer i2 = 200;
		//Integer i1 = Integer.valueOf(200);
		if(i1.equals(i2)){
			System.out.println("i1 == i2");
		}
		else{
			System.out.println("i1 != i2");
		}
	}

}
