import java.util.*;

//classes and objects



class Pen {
    // properties
    String color;
    String type;

    // method ->any function inside a class
    public void write() {
        System.out.println("writing");
    }

    // this -> keyword in java which tells which object is calling function
    public void printColor() {
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //constructor
    //non parametized
    //constructor and class name  are always same
    // Student(){
    //     System.out.println("constructor called");
    // }

    // parametized constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    //copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){
        //empty constuctor used in case of copy constructor
    }



}

public class OOOPS {
    public static void main(String[] args) {
        Pen pen = new Pen(); // object
        pen.color = "red";
        pen.type = "ball";
        pen.write();

        // Pen pen2 = new Pen();
        // pen2.color = "blue";

        // pen.printColor();
        // pen2.printColor();

        // Student s1 = new Student(); //object
        // s1.name = "rakshit";
        // s1.age  = 20;

        // s1.printInfo(); 

        //for parametized constructor
        // Student s1 = new Student("rakshit",20);
        // s1.printInfo();


        //for copy constuctor
        Student s1 = new Student();
        s1.name = "rakshit";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printInfo();




    }

}
