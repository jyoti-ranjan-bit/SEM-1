import java.util.Scanner;
public class ha5 {

	public static boolean consecutive(int x,int y,int z) {
		if ((x+1==y && y+1==z)||(z+1==y && y+1==x)) {
			return true;

	}
		return false;

}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
		System.out.println("enter third no");
		int c=sc.nextInt();
		System.out.println(consecutive(a,b,c)); 
	}
	}
	
