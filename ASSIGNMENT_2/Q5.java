package program2;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the hemisphere:");
		double radius,volume,sarea;
		radius=sc.nextDouble();
		sarea=3*Math.PI*radius*radius;
		volume=(2.0/3.0)*Math.PI*radius*radius*radius;
		System.out.println("Enter the surface area of the hemisphere: "+sarea);
		System.out.println("Enter the volume area of the hemisphere: "+volume);
	}

}
