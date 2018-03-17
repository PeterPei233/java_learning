import java.lang.Double;
public class practice3{
	public static void main(String[] args){
		double r= Double.parseDouble(args[0]);//r是半径
		for(double y=-r;y<=r;y+=2){//因为System.out.println看起来像隔行打印，所以步长为2
    		double a=Math.asin(y/r); //根据纵行坐标y算出角度(弧度)，因为y=r*sin(a)，所以sin(a)=y/x;
   		 	double x=r*Math.cos(a); //算出x坐标,不解释
    		for(double j=-r;j<=r;j++){//算出来的x坐标是正的，只能是半圆，打印整个圆从-r开始
        		System.out.print(Math.abs(j<0?j+x:j-x)<0.5?'*':' ');//double判断不能用==，用临近判断
    		}
    	System.out.println();
		}
	}
}