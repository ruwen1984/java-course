package course.work.lab2;

import java.text.DecimalFormat;     //���ø�ʽ���������
import javax.swing.JOptionPane;     // joptionpane�������ɵ���һ����׼�ĶԻ���

class Point{                           //�����ĵĶ��� 
	protected int x,y ;                // ����������
	public Point(){                    // ȷ�����캯��
		setPoint(0,0);                 
	}
	
	public Point(int a,int b){          //���캯������ �������Ĺ��캯��
	setPoint(a,b);
	}
	
	public void setPoint(int a,int b){  //    
		x=a;
		y=b;
	}
	public int getX(){	return x;}  //���X������
	public int getY(){ return y;}  // ���Y������
	public String toString(){
		return "["+x+","+"y"+"]";
	}		
}
