package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

        int command = 2;

        switch(command){
            case 0:
                System.out.println("CodeRunner running North");
                break;
            case 1:
                System.out.println("CodeRunner running South");
                break;
            case 2:
                System.out.println("CodeRunner running West");
                break;
            case 3:
                System.out.println("CodeRunner running East");
                break;
             default:
                 System.out.println("CodeRunner is confused.");

        }

    }

}
