package course.work.lab2;

public class Square extends Retangle{
	public Square(double side){
		super(side,side);
	}
	
	public double calcPerimeter(){
		return width * 4;
	}
	
	public void Show(){
		System.out.println("�߳�Ϊ" + width + "��������");
	}

}
