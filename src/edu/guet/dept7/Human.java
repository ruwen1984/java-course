package edu.guet.dept7;

public class Human {
	public String name;
	public String sex;
	public int age;
	public String addr;
	
	//成员方法
	void work(){
		System.out.println("我在工作");
	}
	
	void eat(){
		System.out.println("我在吃饭");
	}
	
	public String getState(int time){
		String state = null;
		if(time >=0 && 24 >= time){
			if(time >= 0 && time < 17)
				state = "我在工作";
			else if(time > 17 && time < 22)
				state = "我在学习";
			else if(time > 22 || time < 7)
				state = "我在睡觉";
		}
		else
			state = "错误的时间";
		return state;
	}
}
