import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no:");
		int a=sc.nextInt();
		System.out.println("Enter the second no:");
		int b=sc.nextInt();
		System.out.println("Enter the third no:");
		int c=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i=i+c) {
			System.out.print(i+"\t");
			sum=sum+i;
		}
		System.out.println("The sum of numbers displayed is"+sum);	
		
	}

}
