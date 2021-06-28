package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

       int area = rectArea(9,4);
        System.out.println("Area: " + area);
    }

    public static int rectArea(int width,int length) {
        int area = width*length;
        if(area < 0){
            return -area;
        }

        return area;

    }

}
