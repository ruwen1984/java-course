package edu.guet.dept7;

public class Human {
	public String name;
	public String sex;
	public int age;
	public String addr;
	
	//��Ա����
	void work(){
		System.out.println("���ڹ���");
	}
	
	void eat(){
		System.out.println("���ڳԷ�");
	}
	
	public String getState(int time){
		String state = null;
		if(time >=0 && 24 >= time){
			if(time >= 0 && time < 17)
				state = "���ڹ���";
			else if(time > 17 && time < 22)
				state = "����ѧϰ";
			else if(time > 22 || time < 7)
				state = "����˯��";
		}
		else
			state = "�����ʱ��";
		return state;
	}
}
