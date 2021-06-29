package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

       double quotient = divideNumbers(21,3);
       System.out.println("Quotient: " + quotient);
       int product = multiplyNumbers(3,7);
       System.out.println("Product: " + product);
    }

    public static double divideNumbers(int firstNumber,int secondNumber) {
        double quotient = firstNumber/secondNumber;
        return quotient;
    }

    public static int multiplyNumbers(int firstNumber, int secondNumber){
        int product = firstNumber*secondNumber;
        return product;
    }

}
