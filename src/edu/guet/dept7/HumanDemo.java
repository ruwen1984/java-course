package edu.guet.dept7;

public class HumanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human wangming = new Human();
		
		wangming.name = "王明";
		wangming.age = 25;
		wangming.sex = "男";
		wangming.addr = "中国北京";
		System.out.println(wangming.name + "晚上23点你在干什么");
		
		System.out.println(wangming.getState(23));
		System.out.println("下午5点呢");
		System.out.println(wangming.getState(17));
	}

}
