import java.util.Scanner;
public class ha3 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tha value of n: ");
        int n = input.nextInt();
        input.close();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b; // Calculate sequence using logic of fibonacci
            System.out.print(" " + c);
            a = b; // Assign the new 
            b = c; // values to the old ones
        }
    }
}