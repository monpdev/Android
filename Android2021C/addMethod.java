package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

        addNumbers(12,12);
        multiplyNumbers(3,4);
        divideNumbers(12, 0);
        //showName();
        //anotherMethod("Hello",91);

    }

    public static void showName(){

        for(int i = 0; i < 20; i++){
            if(i % 3 == 0){
                System.out.println(i*3 + " is a multiplication of 3.");
            }
        }


        System.out.println("From ShowName.");

    }


    public static void addNumbers(int a, int b){
        System.out.println("Sum is:"+ (a+b));
    }

    public static void multiplyNumbers(int a, int b){
        System.out.println("Multiplication is: "+ (a*b));
    }


    public static void divideNumbers(int a, int b){
        if(b != 0){
            System.out.println("Division is: " + a/b);
        }else{
            System.out.println("Cannot divide by 0!");
        }
    }

    public static void anotherMethod(String something, int age){
        if(age > 90){
            System.out.println("I am still young.");
        }
        System.out.println("Another Method " + something + " " +age);
    }

}
