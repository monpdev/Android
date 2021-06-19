package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

        String command = "Deposit";
        int balance = 1000;

        switch(command){
            case "Withdraw" :
                balance = balance - 100;
                System.out.println("Your balance used to be 1000 and now it is "+ balance);
                break;
            case "Deposit" :
                balance = balance + 100;
                System.out.println("Your balance used to be 1000 and now it is "+ balance);
                break;


        }

    }

}
