import java.util.*;

//also called function overloading
//condition for polymorhism-
//1 - there return type should be different
//2 - if return type are same so there parameters should be different
//3 - if both the things are same so there no of arguments must be different

class Student1{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }



    //making different function of same name in a class
 }

public class polymorphism {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "rakshit";
        s1.age = 20;

        s1.printInfo(s1.name, s1.age);
       
    }
    
    
}
