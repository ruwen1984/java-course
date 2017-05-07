package edu.guet.dept7;

public class TestSwap {
	
	public static void swap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap方法里，a的值是" + a + "；b的值是" + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.println("交换的结果是" + a + ";" + b);
	}

}
