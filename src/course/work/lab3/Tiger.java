package course.work.lab3;

public class Tiger implements Animal {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The tiger sleep");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The tiger eat");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("The tiger breath");
	}
	public static void main(String [] args){
		Tiger tiger = new Tiger();
		tiger.breath();
		tiger.eat();
		tiger.sleep();
	}
}
