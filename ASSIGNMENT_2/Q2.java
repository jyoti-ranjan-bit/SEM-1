package program2;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in km=");
		double km,meter,feet,inch,centimeter;
		km = sc.nextDouble();
		meter=1000*km;
		feet=3280.8399*km;
		inch=39370.0787*km;
		centimeter=100000*km;
		System.out.println(km+" km is "+meter);
		System.out.println(km+" km is "+feet);
		System.out.println(km+" km is "+inch);
		System.out.println(km+" km is "+km);
	}

}
