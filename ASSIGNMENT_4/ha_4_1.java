
public class ha_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		int sum_2=0;
		for(int i=1;i<=10;i++) {
			double pow=(double)Math.pow(i,2);
			sum=sum+pow;
			
		}
		for(int j=1;j<=10;j++) {
			sum_2=sum_2+j;
			
		}
		double sum_2_sq=Math.pow(sum_2,2);
		System.out.println(sum);
		System.out.println(sum_2_sq);
		double d=sum_2_sq-sum;
		System.out.println("difference= "+d);
			
		
	}

}
