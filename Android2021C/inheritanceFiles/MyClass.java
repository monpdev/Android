package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {

    public static void main(String[] args) {
        //Person james = new Person();
        //Person james = new Person("James", "Bond", 45);
        //System.out.println(james.getAge());

        Employee employee = new Employee();

        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setAge(45);
        employee.setId(12345);
        employee.setAnnualSalary(100000);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getId());
        System.out.println(employee.getAnnualSalary());

        Manager manager = new Manager();
        manager.setFirstName("Manager George");
        manager.setLastName("Kilos");
        manager.setAge(35);
        manager.setId(456);
        manager.setAnnualSalary(45000);

        System.out.println(manager.getAnnualSalary()+ " , " + manager.getFirstName());


        Rectangle rec1 = new Rectangle(7,4);
        // rec1.length = 5;
        // rec1.width = 2;
        rec1.setLength(8);
        rec1.setWidth(10);

        System.out.println("Rectangle area: " + rec1.getLength()*rec1.getWidth());

        Box box1 = new Box();
        box1.setLength(7);
        box1.setWidth(5);

        System.out.println("Box area: " + box1.getLength()*box1.getWidth());


    }



}
