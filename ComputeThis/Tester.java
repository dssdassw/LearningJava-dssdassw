import java.io.PrintWriter; //even though the class it extends imports this, it won't compile otherwise
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Tester {
    public static double equation1() {
        return (3*Math.PI*Math.sin(Math.toRadians(187))+Math.abs(Math.cos(Math.toRadians(122))));
    }
    public static double equation2() {
        return (Math.pow(14.72, 3.801)+Math.log(72D));
    }
    public static void main(String[] args) {
        PrintWriter stdout = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true);
        stdout.println("3πsin(187°) + |cos(122°)| = " + (equation1()));
        stdout.println("(14.72)^3.801 + ln 72 = " + (equation2()));
    }
}
