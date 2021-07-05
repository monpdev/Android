package monp.example.learnjava;

public class javaConstructor {
    public static void main(String[] args) {
        Person person = new Person("James",56);
        System.out.println(person.age);

        Hero superman = new Hero("Super Man",123,345);
        System.out.println(superman.power);
    }

}
