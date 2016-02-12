//for getPrintWriter() {
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
//}
public class Tools {
    public static void prnt(String toPrint){
        System.out.println(toPrint);
    }
    public static int find(String[] searchString, String thing) {
        int pos = -1;
        for(int i = 0; i < searchString.length; i++) {
          if(searchString[i] == thing) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    public static PrintWriter getPW() { //can't do optional arguments lol so just UTF-8, fuck you
		return (new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true));
	}
}
