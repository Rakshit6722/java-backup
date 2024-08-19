import java.util.*;

public class firstLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void firstLast(String str, int i, char element){
        if(i == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(i);
        if(currChar == element){
            if(first == -1){
                first = i;
            }else{
                last = i;
            }
        }
        firstLast(str, i+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        firstLast(str, 0, 'a');

    }
}
