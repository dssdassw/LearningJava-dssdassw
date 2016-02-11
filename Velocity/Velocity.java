import java.util.Scanner;

public class Velocity {
	public static double[] getInput() {
		double[] array;
		array = new double[2];
		Scanner in = new Scanner(System.in);
		System.out.println("\ninput the time\n");
		array[0] = in.nextDouble();
		System.out.println("\ninput the velocity\n");
		array[1] = in.nextDouble();
		return array;
	}
	public static double getVelocityAtT(double t, double v) {
		return (9.81*t+v);
	}
	public static void main(String args[]) {
		double[] darray;
		darray = new double[2];
		darray = (getInput());
		System.out.println("The velocity at the current time is " + (getVelocityAtT(darray[0], darray[1])));
	}
}
