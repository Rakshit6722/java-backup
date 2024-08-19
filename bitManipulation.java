import java.util.*;

public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        // Get bit (AND &)
        // approach
        // create a bit mask // for ex:position - 2 so, 1 << position i.e. 1 << 2
        // perform bitwise and operation - bit mask & number
        // if final number is non-zero then bit is 1 otherwise bit is 0

        // int ls = 1 << p; // left shift w.r.t. given position
        // int sum = ls & n;// bitwise addition

        // if (sum == 0) {
        //     System.out.println("It was zero");
        // } else {
        //     System.out.println("It was one");
        // }



        //Set bit (OR |)
        //approach
        //same as get bit
        //but we will perform bitwise OR operation instead of bitwise AND operation

        // int ls = 1 << p;
        // int or = ls | n;
        // System.out.println(or);




        //Clear bit (NOT ~)
        //clearing a bit at a specific position
        //create a bit mask
        //perfrom AND operation with NOT of bitmask

        // int ls = 1<<p;
        // int newNumber = n & ~(ls);//AND opertaion with n and NOT of bit mask
        // System.out.println(newNumber);




        //Update bit
        //two cases
        //update bit to 0            //update bit to 1
        //create bit mask            //create bit mask
        //AND with NOT               //OR

        // int oper = sc.nextInt();

        // int bitMask = 1<<p;

        // if(oper == 1){
            
        //     int newNumber = bitMask | n;
        //     System.out.println(newNumber);
        // }

        // else{
        //     int Nbitmask = ~(bitMask);
        //     int number = Nbitmask & n;
        //     System.out.println(number);
        // }
    }

}
