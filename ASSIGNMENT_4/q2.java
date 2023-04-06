import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int pnum=n;
		int sum=0;
		while(n>0) {
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
			System.out.println("sum is"+ sum);
			if(sum%9==0)
			{System.out.println("the no "+pnum+"is divisible");
				
			}
			else {
		
				System.out.println("The no "+pnum+"is not divisible");
			}
	}

}
