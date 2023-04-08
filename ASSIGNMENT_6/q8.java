import java.util.Scanner;
public class q8 {

	public static boolean isPalindrome(String str) {
		int strlength=str.length();
		String reverse="";
		
		for(int i=(strlength -1);i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverse.toLowerCase())) {
			return true;
		}
		else {
			return false;
		}
	
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		boolean a = isPalindrome(s);
		if(a) {
			System.out.print("the string is a palandrome");
		}else {
			System.out.print("the string is not palandrome");
		}
	}

}
