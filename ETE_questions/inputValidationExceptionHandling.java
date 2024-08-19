import java.util.*;
public class inputValidationExceptionHandling {

    static boolean checkName(String str){
        return str.matches("^[a-zA-Z]+$");
    }
    static boolean checkId(int num){
        return num>0;
    }
    static boolean checkSalary(double num){
        return num>=0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int id = sc.nextInt();
        double sal = sc.nextDouble();

        if(!checkName(str)){
            System.out.println("Invalid Name");
        }
        if(!checkId(id)){
            System.out.println("Invaild Id");
        }
        if(!checkSalary(sal)){
            System.out.println("Inavlid Salary");
        }
    }
}
