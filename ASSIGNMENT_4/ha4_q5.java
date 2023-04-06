import java.util.Scanner;
public class ha4_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		 String str=" ";
		for(int i=1;i<=n;i++) {
			str=str+i+str;
			System.out.println(str);
		}
	}

}
