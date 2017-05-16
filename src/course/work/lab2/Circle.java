package course.work.lab2;

class Circle extends Point {     //圆类继承父类点类 
	protected double radius ;//定义圆的半径
	public Circle(){ setRadius(0);}// 定义子类的构造函数，隐含调用了父类的构造函数
	public Circle(double r,int a,int b){
		super(a,b);//           （2）                          
		setRadius(r);
		}
	public void setRadius(double r){
		radius = (r>=0.0?r:0.0); //               （3）                
		} 
	public double getRadius(){ 	// 获得圆半径
	        return  radius;
		              }  
	public double area(){  //               （4）                      
		 return Math.PI*radius*radius;
		  } 
	public String toString(){//圆的半径。以及圆心坐标转换成字符串输出
	return "Center="+"["+x+","+y+"]"+";Radius="+radius;
	
	} 
}

