import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		String str=" ";
		while(n>0) {
			int d=n%10;
			if (d!=0) {
				str=d+str;//sidha print hora iske chalte
			}
			n=n/10;
		}
		System.out.println(str);
		}
	}


