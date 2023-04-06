import java.util.Scanner;

public class ha5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x in radians: ");
        double x = input.nextDouble(),sum=0.0;
        System.out.println("Enter value of n times the expansion: ");
        double n = input.nextDouble();
        input.close();

        for (int i = 0; i < n; i++) {
            double numerator = Math.pow(-1, i);
            double denominator = fact(2 * i + 1);
            double term = numerator * Math.pow(x, 2 * i + 1) / denominator;
            sum += term;
        }
        System.out.println(sum);
    }






    public static double fact(double a){
        double fact=1;
        for (int i=1;i<=a;i++){
            fact*=i;
        }

        return fact;
    }
    
}