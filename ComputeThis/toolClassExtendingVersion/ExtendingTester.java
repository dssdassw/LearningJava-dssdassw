import java.io.PrintWriter; //even though the class it extends imports this, it won't compile otherwise

public class ExtendingTester extends Tools {
    public static double equation1() {
        return (3*Math.PI*Math.sin(Math.toRadians(187))+Math.abs(Math.cos(Math.toRadians(122))));
    }
    public static double equation2() {
        return (Math.pow(14.72, 3.801)+Math.log(72D));
    }
    public static void main(String[] args) {
        //PrintWriter stdout = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true);
        PrintWriter stdout = getPW();
        stdout.println("3πsin(187°) + |cos(122°)| = " + (equation1()));
        stdout.println("(14.72)^3.801 + ln 72 = " + (equation2()));
    }
}
