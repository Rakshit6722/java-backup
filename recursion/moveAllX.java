import java.util.*;

public class moveAllX {

    public static void moveAll(String str, int i, int count, String newstr){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(i);
        if(currChar == 'x'){
            count++;
            moveAll(str, i+1, count, newstr);
        }
        else{
            newstr += currChar;
            moveAll(str, i+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        String newstr = "";
        moveAll(str, 0, 0, str);
    }
}
