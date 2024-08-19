package OOPS1;

class Student{//creating a template with group of properties
    int rollno;
    String name;
    float marks;
}

public class classObjectsConstructorsKeywords {
    public static void main(String[] args) {
        Student stu = new Student();//creating object of student class using new keyword
        stu.rollno = 23;//. operator is used to access instance variable
        stu.name = "abc";
        stu.marks = 12;
        System.out.println(stu.name);
    }
}
