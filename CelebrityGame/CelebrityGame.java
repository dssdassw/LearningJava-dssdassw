public class CelebrityGame {
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
        String[] celebrityList = new String[4];
        celebrityList[0] = "Hideo Kojima"; celebrityList[1] = "Sakurai"; celebrityList[2] = "John Madden"; celebrityList[3] = "The hacker 4chang";
        String[] modifiedList = new String[celebrityList.length];
        modifiedList = modifyNames(celebrityList);
        for(String name : modifiedList) {
            System.out.println(name);
        }
    }
}
