
public class ha4_2 {

	 public static void main(String[] args) {
         int sum=0;
         for (int i=1;i<=999;i++) {
                 if (i%3==0 || i%5==0) {
                         sum += i;
                 }
         }
         System.out.print("Sum of all natural numbers which are multiples of 3 and 5 below 1000 is = "+sum);
 }

	}


