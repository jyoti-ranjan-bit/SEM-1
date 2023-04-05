package program2;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a degree in Fahrenheit:");
		Double Fahrenheit,Celsius;
		Fahrenheit=sc.nextDouble();
		Celsius=(Fahrenheit-32)*(5.0/9.0);
		System.out.println(Fahrenheit+"Fahrenheit is"+Celsius+"Celsius");
	}

}
