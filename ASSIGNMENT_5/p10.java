
import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int a = 0 , b = 1 , c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i=3 ; i<=n ; i++) {
            int sum = a + b + c;
            System.out.print(sum + " ");
            a = b;
            b = c;
            c = sum;
        }
    }
}