package course.work.lab2;

import java.text.DecimalFormat;     //调用格式化数字输出
import javax.swing.JOptionPane;     // joptionpane让您轻松弹出一个标准的对话框

class Point{                           //父类点的的定义 
	protected int x,y ;                // 定义点的坐标
	public Point(){                    // 确定构造函数
		setPoint(0,0);                 
	}
	
	public Point(int a,int b){          //构造函数重载 带参数的构造函数
	setPoint(a,b);
	}
	
	public void setPoint(int a,int b){  //    
		x=a;
		y=b;
	}
	public int getX(){	return x;}  //获得X的坐标
	public int getY(){ return y;}  // 获得Y的坐标
	public String toString(){
		return "["+x+","+"y"+"]";
	}		
}
