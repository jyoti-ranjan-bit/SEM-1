import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int power=0;
		int p_o = 1;
		for(int i=1;i<=n;i++) {
			p_o=power;
			power=(int)Math.pow(3,i);
			if(power >=100) {
				System.out.println(p_o);
				break;
			}
			
			
			
		}
		System.out.println("The largest power of 3 less than or equal to "+n+" is "+p_o);		
	}

}
