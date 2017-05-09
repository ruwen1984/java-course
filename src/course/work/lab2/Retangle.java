package course.work.lab2;

public class Retangle {
	protected double length;
	protected double width;
	public Retangle(double l,double w){
		length = l;
		width = w;
	}
	public double calcPerimeter(){
		
		return (length + width) * 2;
	}
	
	public double calcArea(){
		return length * width;
	}
	
	public void show(){
		System.out.println("The Perimeter is:" + calcPerimeter() + "; The Area is:" + calcArea());
	}
}
