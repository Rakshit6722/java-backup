import java.util.*;

//when one class inherit properties of another class
//extends keyword is used 

//class from which prop. are inherited is called base class
//and class which inherit the property is called sub or child class



// class Shape{
//     String color;
// }

// //Triangle class will inherit properties of Shape class 
// //extends is a keyword which enables Triangle calss to do so
// class Triangle extends Shape{

// }

// public class inheritance {

//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.color = "Red";
//     }
    
// }


//inheritance has  types in java while it has 5 types in C++


//Single Level Inhertiance -> class inhertied from another class

class Shape{
    int l;
    int h;
    int r;
    public void area(){
        System.out.println("It displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//multi level inheritance -> a class which is inhertied from a class which is also inhertied from another class
class EquilateralTriangle extends Triangle{
        public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//hierarchial inheritance -> multiple classes inhertied from a single base class
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//hybrid inheritance -> combination of different types of inhertiance;

public class inheritance{

    public static void main(String[] args) {
    Triangle t1 = new Triangle();

    t1.area();
        
    }


}
