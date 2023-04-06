import java.util.Scanner;
public class ha_3_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n =sc.nextInt();
		int sum=0;int prod=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}else {
			prod=prod*i;
		}
		}
			System.out.println("sum of all even nos "+sum);
	System.out.println("prod of all odd nos "+prod);
	}
}

