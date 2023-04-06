import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("first number");
		int n = sc.nextInt();
		System.out.print("second number");
		int m = sc.nextInt();
		int flag=0;
		for(int i=n;i<m;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag++;
					break;
				}
			
			
		}if(flag==0) {
			System.out.println(i);
		}
		else {
			flag=0;
		}
		}
		
	}

}
