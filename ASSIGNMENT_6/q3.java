import java.util.Scanner;
public class q3 {

	public static int reverse(int number) {
		int rev=0;
		while(number !=0) {
			int d=number %10;
			rev=rev*10+d;
			number =number /10;
		}
	return rev;
	}
	public static boolean isPalindrome(int number) {
		int rev_num = reverse(number);
        return number == rev_num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome Number");
        } else {
            System.out.println(n + " is not a palindrome Number");
        }
	}
}
