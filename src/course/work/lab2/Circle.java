package course.work.lab2;

class Circle extends Point {     //Բ��̳и������ 
	protected double radius ;//����Բ�İ뾶
	public Circle(){ setRadius(0);}// ��������Ĺ��캯�������������˸���Ĺ��캯��
	public Circle(double r,int a,int b){
		super(a,b);//           ��2��                          
		setRadius(r);
		}
	public void setRadius(double r){
		radius = (r>=0.0?r:0.0); //               ��3��                
		} 
	public double getRadius(){ 	// ���Բ�뾶
	        return  radius;
		              }  
	public double area(){  //               ��4��                      
		 return Math.PI*radius*radius;
		  } 
	public String toString(){//Բ�İ뾶���Լ�Բ������ת�����ַ������
	return "Center="+"["+x+","+y+"]"+";Radius="+radius;
	
	} 
}

