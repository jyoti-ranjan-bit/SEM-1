import java.util.*;
public class array {

	public static void main(String[] args) {
		// initialization of array 
		Scanner Sc=new Scanner (System.in);
		System.out.println(" enter the desire length of array u want");
		int n=Sc.nextInt();
		int []arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.println(" enter the element");
			arr[i]=Sc.nextInt();
		}
		System.out.println(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println( "the sum of all the element of array is   "+sum);
		int avg=sum/n;
		System.out.println(" the average of all thge element of array is "+avg);
		System.out.println('c'+'a'+2+3+"bc");

	}

}
