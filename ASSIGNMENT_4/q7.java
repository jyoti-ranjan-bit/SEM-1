import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber for which you want to find the multiplication table:");
		int n=sc.nextInt();
		System.out.println("The multiplication table of"+n+"is");
		int product=1;
		for(int i=1;i<=10;i++) {
		product=n*i;
		System.out.println(n+" * "+i+" = "+product);
		}
	}

}
