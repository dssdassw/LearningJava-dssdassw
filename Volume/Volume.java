public class Volume {
	public static double getVolume(double r, double h) {
        return (((3.14)*(r*r))*h);
	}
	public static void main(String args[]) {
        System.out.println("The volume is " + (getVolume(15.00, 4.00)));
    }
}
