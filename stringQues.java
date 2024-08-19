import java.util.*;

public class stringQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();



        //REVERSE STRING

        //1 - reverse array using  toCharArray()
        // char chr[] = str.toCharArray();
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(chr[i]);
        // }
        // System.out.println();

        // //2 - reverse using charAt()
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }
        // System.out.println();

        // //3 - reverse using reverse() -> StringBuffer
        // StringBuffer sb = new StringBuffer(str);
        // System.out.print(sb.reverse());
        // System.out.println();

        // //4 - reverse using reverse() -> StringBuilder
        // StringBuilder st = new StringBuilder(str);
        // System.out.println(st.reverse());






        //remove special character from string
        // //using replaceAll()
        // String plnStr = str.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(plnStr);





        //removing all white spaces
        // String noSpc = str.replaceAll("\\s", "");
        // System.out.println(noSpc);





        //remove dulplicate character in string
        //using toCharArray() method
        // char arr[] = str.toCharArray();
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<arr.length;i++){
        //     boolean repeated = false;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             repeated = true;
        //         }
        //     }
        //     if(!repeated){
        //         sb.append(arr[i]);
        //     }
        // }
        // System.out.println(sb);






        //sort string characters
        // char arr[] = str.toCharArray();
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             char temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        // System.out.println(new String(arr));




        //replace character with its occurence

        // char ch = sc.next().charAt(0);
        // //check if the char is present in the string
        // if(str.indexOf(ch)==-1){
        //     System.exit(0);
        // } 
        // char arr[] = str.toCharArray();
        // int  count = 1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] == ch){
        //         arr[i] = String.valueOf(count).charAt(0);
        //         count++;
        //     }
        // }
        // System.out.println(new String(arr));




        //find frist non repeated character in string
        // for(int i=0;i<str.length();i++){
        //     boolean unique = true;
        //     for(int j=0;j<str.length();j++){
        //         if(i!=j && str.charAt(i)==str.charAt(j)){
        //             unique = false;
        //             break;
        //         }

        //     }
        //     if(unique){
        //         System.out.println(str.charAt(i));
        //         break;
        //     }
        // }



        //find occurence of each character
        // for(int i=0;i<str.length();i++){
        //     for(int j=0;j<str.length();j++){
        //         if()
        //     }
        // }



        //code with harry ques

        //convert string to lowercase
        //System.out.println(str.toLowerCase());

        //replace spaces with underscore
        //System.out.println(str.replaceAll(" ", "_"));

        //ques 3
        // String letter = "Dear <|name|>, Thanks a lot!";
        // String name = sc.nextLine();
        // letter = letter.replace("<|name|>", name);
        // System.out.println(letter);
 
        //detect double and triple spaces
        // String str = "this string contains   double and triple spaces";
        // System.out.println(str.indexOf("  "));
        // System.out.println(str.indexOf("   "));





        
        






         





    }
}
