package edu.guet.dept7;

public class HumanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human wangming = new Human();
		
		wangming.name = "����";
		wangming.age = 25;
		wangming.sex = "��";
		wangming.addr = "�й�����";
		System.out.println(wangming.name + "����23�����ڸ�ʲô");
		
		System.out.println(wangming.getState(23));
		System.out.println("����5����");
		System.out.println(wangming.getState(17));
	}

}
