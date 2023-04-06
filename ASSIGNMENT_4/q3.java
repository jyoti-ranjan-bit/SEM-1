import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;int count=1;
		System.out.println("Random nos generated are");
		do {
			int random=(int)(Math.random()*(n-1)+1);
			System.out.print(random+" ");
			sum=sum+random;
			count=count+1;
		}
		while(count<=n);//n se kam random no generate karne k liye(usko pta isi se chalega ki n se kam random no generate krna hai)ye condition bnane k liye
		double avg=sum/n;
		System.out.println("Average of "+n+"random nos are "+avg);
			
			
	}

}
