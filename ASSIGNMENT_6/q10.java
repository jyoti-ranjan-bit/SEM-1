import java.util.Scanner;
public class q10 {

	public static double area(int a,int b) {
		return (0.5*a*b);
	}
	public static double area(double s) {
		return (s*s);
	}
	public static double area(int r) {
		return (Math.PI*r*r);
	}
	public static double area(double c,double d) {
		return (c*d);
	}
	public static void main(String[]args) {
		System.out.println(area(5,8));
		System.out.println(area(6.10));
		System.out.println(area(8));
		System.out.println(area(7.8,8.5));
		
	}
	
}
