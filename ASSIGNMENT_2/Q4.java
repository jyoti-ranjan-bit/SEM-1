package program2;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		int num,sum,rem;
		num=sc.nextInt();
		sum=0;
		rem=num%10;
		num=num/10;
		sum=sum+rem;
		
		rem=num%10;
		num=num/10;
		sum=sum+rem;
		
		rem=num%10;
		num=num/10;
		sum=sum+rem;
		
		System.out.println("The sum of the digit is "+sum);
	}

}
