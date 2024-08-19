import java.util.Scanner;

// new keyword
// makes object of a class
 

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n;
        // n = sc.nextInt();

        // //one way of declaring array
        // int marks[] = new int[n];

        // //another way of declacring array
        // //int[] marks = {1,3,3,3,1}

        // //one way of assigning values to arrays elements
        // // marks[0] = 89;
        // // marks[1] = 88;
        // // marks[2] = 77;

        // //one way of printing value of elements of array
        // //System.out.println(marks[0]);

        // //taking values of array as input from user
        // for(int i=0;i<n;i++){
        // marks[i]=sc.nextInt();
        // }

        // //printing the value of elements of array via for loop
        // for(int i=0;i<n;i++){
        // System.out.print(marks[i]+" ");
        // }

        // find a number in an array
        // int n = sc.nextInt();
        // int arr[] = new int[n];

        // int key = sc.nextInt();
        // boolean flag = true;

        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == key) {
        //         flag = false;
        //         break;
        //     }
        // }
        // if (flag == false) {
        //     System.out.println("Element found!");
        // } else {
        //     System.out.println("Element not found");
        // }

        Object arr = new Object[5];
        arr[0]= 10;
        arr[1]='A';
        arr[2] = "abc";
        arr[3] = True;
        arr[4] = 1000;

        System.out.println(arr[0]);

    }
}
