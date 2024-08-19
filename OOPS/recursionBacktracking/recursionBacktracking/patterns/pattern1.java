package recursionBacktracking.patterns;

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        triangle(4, 0);
        normalTriangle(4, 0);

    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void normalTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            normalTriangle(r, c + 1);
            System.out.print("*");
        } else {
            normalTriangle(r - 1, 0);
            System.out.println();
        }
    }
}
