
public class ha2 {

	public static double volume(int r) {
		return(4/3*Math.PI*r*r*r);

	}
	public static double volume(double l,double b,double h) {
		return (l*b*h);
	}
	public static double volume(double s) {
		return(s*s*s);
	}
	public static void main(String[]args) {
		System.out.println(volume(5.83));
		System.out.println(volume(6,3,4));
		System.out.println(volume(6));
	}
}
