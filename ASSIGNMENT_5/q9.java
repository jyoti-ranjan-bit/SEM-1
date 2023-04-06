import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i=1 ; i<=n ; i++) {
            double s = 1 / Math.pow(i , 2);
            sum = sum + s;
        }
        System.out.println("The sum is " + sum);

	}

}
