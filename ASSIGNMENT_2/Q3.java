package program2;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary:");
		double bs,da,hra,gs;
		bs=sc.nextDouble();
		da=bs*(40.0/100.0);
		hra=bs*(20.0/100.0);
		gs=bs+da+hra;
		System.out.println("DA is "+da);
		System.out.println("HRA is "+hra);
		System.out.println("Gross Salary is "+gs);
	}

}
