import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		int rev=0;int flag=0,flag2=0;
		while(n>0){
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag++;
			}
		}for (int j=2;j<rev;j++) {
			if(rev%j==0) {
				flag2++;
			}
		}
		if(flag==0 && flag2==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
