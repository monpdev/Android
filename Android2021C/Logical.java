package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

        //Variable = bucket in memory.
        int a = 12;
        int b = 11;

        boolean isSnowing = false;

        if ((a > b) || (isSnowing == true)) {
            System.out.println("True since one or both conditions are true.");
        } else {
            System.out.println("False since both conditions are false.");
        }

    }

}
