import java.util.Scanner;

public class Rectangle {
    public static double[] getInput() {
        double[] array;
        array = new double[2];
        Scanner in = new Scanner(System.in);
        System.out.println("w = ");
        array[0] = in.nextDouble();
        System.out.println("h = ");
        array[1] = in.nextDouble();
        return array;
    }
    public static double getArea(double w, double h) {
        return (w*h);
    }
    public static void main(String[] args) {
        double[] darray = new double[2];
        darray = getInput();
        System.out.println("The area of the rectangle is " + (getArea(darray[0], darray[1])) + "cm");
        System.out.println("Allahu ackbar my friends, allahu ackbar.");
    }
}
