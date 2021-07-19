package monp.example.learnjava;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MyClass {

    public static void main(String[] args) {

        int[] myArray = {1, 33, 4, 12, 89, 98, 90, 12, 43, 1234};
        String[] names = {"James","Anthony","Rodrigo","Niraj"};

        int[] newArray = new int[4];
        String[] newNames = new String[5];

        newArray[0] = 12;
        newArray[1] = 13;
        newArray[2] = 133;
        newArray[3] = 113;


        //for(int i = 0; i < myArray.length; i++){
        //    System.out.println("Items : " + newArray[i]);
        //}

       //Array List
        // ArrayList<String> name = new ArrayList<>();
        ArrayList name = new ArrayList();
        name.add(1);
        name.add("Hello");
        name.remove("Hello");
        System.out.println(name);

    }


}








