package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

       String bio = showBio("George","I was born in NE",33);
        System.out.println(bio);
    }

    public static String showBio(String name, String bio,int age) {
        String description = "My name is "+name+ " and I am "+age+ " year old."+bio;

        return description;

    }

}
