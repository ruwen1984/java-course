package course.work.lab2;

public class Test {
	public static void main(String [] args){
		Square sq1 = new Square(2.0);
		sq1.Show();
		System.out.println("正方形的边长为" + sq1.calcPerimeter());
	}
}
