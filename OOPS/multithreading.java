import java.util.*;

public class multithreading {

    class A extends Thread {
        public void run() {

            for (int i = 0; i < 5; i++) {
                System.out.print(i + " ");
            }
        }

    }

    class B extends Thread {
        public void run() {

            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
        }
    }

    class C extends Thread {
        public void run() {

            for (int k = 0; k < 5; k++) {
                System.out.print(k + " ");
            }
        }
    }

    public static void main(String[] args) {
        A thread1 = new A();

        new B().start();
        new C().start();
       
    }
}
