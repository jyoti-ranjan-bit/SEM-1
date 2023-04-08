import java.util.Scanner;
public class q1 {

	public static int additionSimple(int x,int y) {	
		return x+y;
	}
public static int subtractionSimple(int x,int y) {		
		return y-x;
	}
public static int multiplicationSimple(int x,int y) {	
	return x*y;
}
public static int divisionSimple(int x,int y) {	
	return y/x;
}
public static int remainderSimple(int n,int m) {
	return n%m;
}
public static double squareRootSimple(int n) {	
	return Math.sqrt(n);
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter 1st no");
	int a=sc.nextInt();
	System.out.print("enter 2nd no");
	int b=sc.nextInt();
	
	System.out.print("Enter the operator:");
	System.out.print("use +:add,-:sub,*:mul,/:div.%:rem,r:squrt");
	char si = sc.next().charAt(0);
	int q=0;
	switch(si) {
	case '+':q=additionSimple(a,b);break;
	case '/':q=divisionSimple(a,b);break;
	case '%':q=remainderSimple(a,b);break;
	case '*':q=multiplicationSimple(a,b);break;
	case '-':q=subtractionSimple(a,b);break;
	case 'r':q=(int)squareRootSimple(a);break;
	
	}
	System.out.print(q);
}
}
