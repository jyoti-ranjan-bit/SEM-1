import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=0;//while loop ke andhar gusne k liye (step 8 true krne k liye)
		int random=(int)(Math.random()*(10-1)+1);
		while(n!=random) {
			n=sc.nextInt();//jab tak sahi nahi dalenge tab tak puchega isliye while loop k andhar
			//System.out.println("computer guess"+random);
			System.out.println("User guess"+n);
			System.out.println("c guess"+random);
		if (n<random) {
			System.out.println("too low");
			}
		if(n>random) {
			System.out.println("too high");
		}
			else if(n==random) {
				System.out.println("good guess");
				}
		}
	}}


