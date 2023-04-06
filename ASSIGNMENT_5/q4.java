import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m number");
		int m=sc.nextInt();
		System.out.println("Enter n number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=m;i<=n;i++) {
			if(m>n || m>0 || n>0) {
				for(int j=1;j<=i;j++) {
					fact=fact*i;
				}
				System.out.println(i+"factorial is:"+fact);
				fact=1;
			}
		}
	}

}
