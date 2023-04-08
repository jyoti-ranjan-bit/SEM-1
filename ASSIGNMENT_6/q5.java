import java.util.Scanner;
public class q5 {

	public static double area(int n,double side) {
	double ara = (n * side  * side) / (4 * Math.tan(Math.PI/n));
    return ara;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the side : ");
        double s = sc.nextDouble();
        System.out.println("area is "+area(n,s));
}
	
}
