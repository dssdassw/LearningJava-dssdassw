import java.util.Scanner;

public class CelebrityGame {
    public static String[] modifyNames(String[] celebrities) {
        String[] returnString = new String[celebrities.length];
        int i = -1;
        for(String celeb : celebrities) {
            i = ++i;
            returnString[i] = celebrities[i].substring((int)(Math.floor(1D + (Math.random() * (celebrities[i].length()-1D)))));
        }
        return returnString;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] celebrityList = new String[4];
        celebrityList[0] = "Hideo Kojima"; celebrityList[1] = "Sakurai"; celebrityList[2] = "John Madden"; celebrityList[3] = "The hacker 4chang";
        String[] modifiedList = new String[celebrityList.length];
        modifiedList = modifyNames(celebrityList);
        System.out.println("This program actually works");
        for (int i=0; i < modifiedList.length; i++) {
            System.out.println(modifiedList[i]);
            System.out.println("Whose name is this?");
            int score = 0;
            if ((in.nextLine()).equals(celebrityList[i])) {
                System.out.println("That is correct!");
                score = ++score;
            }
            System.out.println("Your score is " + score);
        }
    }
}
