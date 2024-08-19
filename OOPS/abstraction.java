import java.util.*;

//showing imp. things to user while hiding non imp. things from them


//abstraction using abstract keyword
// abstract class Animal{
//     abstract public void walk();

//     //constructor
//     Animal(){
//         System.out.println("animal is called");

//     }

    
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse is called");
//     }
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }

//abstraction using inteface
//cannot create a constructor inside an interface and nor a function
//all method are public and abstract by default
// interface Animal{
//     int eyes = 2;
//     void walk();
    
// }
// interface Herbivore{
  
// }
// class Horse implements Animal, Herbivore{
//     public void walk(){
//         System.out.println("Walk on 4 legs");
//     }
// }


//Static keyword
//used for fixed things 
class Student{
    String name;
    static String school;

    public static void changeSchl(){
        school = "SNP";
    }
}

public class abstraction {

    public static void main(String[] args) {
        // Horse horse = new Horse();
        // horse.walk();

        // Animal animal = new Animal();
        // animal.walk();
        //this will who error as it animal is a abstract class
        //and the type of error will be runtime error because it occurse when we run the program not on time of compilation


        Student.school = "SNVP";
        Student s1 = new Student();
        s1.name = "rakshit";
        Student.changeSchl();
        System.out.println(s1.school);

    }
    
}
