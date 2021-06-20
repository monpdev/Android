package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

        String command = "Deposit";
        int balance = 1000;
        int amount = 100;

        switch(command){
            case "Withdraw" :
                balance = balance - amount;
                break;
            case "Deposit" :
                balance = balance + amount;
                break;

        }

        System.out.println("Your balance used to be 1000 and now it is "+ balance);

    }

}
