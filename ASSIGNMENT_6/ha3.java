import java.util.Scanner;
public class ha3 {

	public static String middlechar(String str) {
		int length=str.length();
		if (length %2==0) {
			return str.substring(length/2,(length+1)/2);
		}
			
		return str.substring(length/2,(length+2)/2);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.next();
		System.out.println(middlechar(s));
	}
}
