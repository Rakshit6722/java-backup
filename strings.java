//Strings are imutable in java

import java.util.*;

public class strings {
    public static void main(String args[]) {
        // string declaration
        // String name = "Rakshit";
        // String sentence = "My name is rakshit";

        // taking string as input
        Scanner sc = new Scanner(System.in);
        // //String name = sc.next(); // take one token at a time
        // String name = sc.nextLine(); // take whole sentence

        // System.out.println(name);

        // //concatenation
        // String firstName = "Rakshit";
        // String lastName = "Chauhan";
        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);
        // System.out.print(fullName.length());

        // //charAt
        // for(int i=0;i<fullName.length();i++){
        // System.out.println(fullName.charAt(i));
        // }

        // compare //.compareTo
        // String name1 = "rakshit";
        // String name2 = "rakshit";

        // // if(name1.compareTo(name2)==0){
        // // System.out.print("Strings are equal");
        // // }

        // //another way to compare
        // //but in few cases it fails so we should use .compareTo function more
        // if(name1 == name2){
        // System.out.print("Strings are equal");
        // }
        // else{
        // System.out.println("strings are not equal");
        // }

        // //Substring //.substring(begining index, ending index)
        // String sentence = "My name is rakshit";
        // String name = sentence.substring(8);
        // String name1 = sentence.substring(4,10);//it will take string from 4th index
        // till 9th index, will not include 10th index
        // System.out.println(name);
        // System.out.println(name1);

        //ParseInt Method
        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        //toString method
        // int number = 123;
        // String str = Integer.toString(number);
        // System.out.println(str);        
        // System.out.println(str.length());

        // an array of Strings input from the user & find the 
        //cumulative (combined) length of all those strings.
        int n = sc.nextInt();
        String arr[] = new String[n];
        int sum = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            sum += arr[i].length();

        }
        System.out.print(sum);



    }
}
