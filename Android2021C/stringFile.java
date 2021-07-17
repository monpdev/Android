package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {

    public static void main(String[] args) {
        //Person james = new Person();
        //Person james = new Person("James", "Bond", 45);
        //System.out.println(james.getAge());

        int a = 12;
        String myString = "Hello there!";
        boolean isEmpty = myString.isEmpty();
        boolean contains = myString.contains("h");

        if(!isEmpty){
            System.out.println(myString);
        }else {
            System.out.println("Empty!");
        }

        if(contains){
            System.out.println("Yes contains h");
        } else{
            System.out.println("No h in there.");
        }

        /*

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
        System.out.println(manager.getAnnualSalary()+" , "+manager.getFirstName()+" Id: "+manager.getId());

        Box box1 = new Box(7,5,2);
        System.out.println("Box area: " + box1.area());

        /*
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

         */



    }



}








/*
    Microphone microphone = new Microphone("Blue Yeti", "Blue", 34455);
// microphone.color = "Blue";
// microphone.name = "Blue Yeti";
// microphone.model = 133543;

        microphone.setModel(87);
                microphone.setName("New Blue Yeti");
                microphone.setColor("Red blue");

                System.out.println("New Mic: "+ microphone.getModel());


                Microphone gHMic = new Microphone("gHMic","Red",465);
                //gHMic.model = 465;
                //gHMic.name = "GHZB";
                //gHMic.color = "Red";

                //System.out.println(microphone.name);
                //System.out.println(gHMic.name);

                Rectangle rec1 = new Rectangle(7,4);
                // rec1.length = 5;
                // rec1.width = 2;
                rec1.setLength(8);
                rec1.setWidth(10);

                System.out.println("New area: " + rec1.getLength()*rec1.getWidth());

                //System.out.println("Rectangle area: "+ rec1.length*rec1.width);

                microphone.turnOn();
                microphone.setVolume();
                microphone.turnOff();

                gHMic.turnOn();
                gHMic.setVolume();
                gHMic.turnOff();

                Microphone newMic = new Microphone("NewMic","Green",123);
                Microphone otherMic = new Microphone();
                otherMic.setColor("Other Mic");

                System.out.println(otherMic.getColor());

                Microphone grandMic = new Microphone("Grand","Yellow");

                System.out.println(microphone.showDescription());
*/
