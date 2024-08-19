import java.util.*;
public class AthBinaryRepresentation {
    static int binary(int n){
        int currNumber=1;
        int count = 1;

        while(count<n){
            currNumber++;
            String binary = Integer.toBinaryString(currNumber);
            if(binary.equals(new StringBuilder(binary).reverse().toString())){
                count++;
            }
        }
        return currNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary(n));
    }
}
