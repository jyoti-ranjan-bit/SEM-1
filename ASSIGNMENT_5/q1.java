import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		System.out.println("Enter 2nd no");
		int m=sc.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum1=sum1+i;
			}
			
		}
		for (int j=1;j<m;j++) {
			if(m%j==0) {
				sum2=sum2+j;
			}
				
		}
		if(sum1==m && sum2==n) {
		System.out.println("amicable no");}
		else {
			System.out.print("not amicable");
		}
	}

}
