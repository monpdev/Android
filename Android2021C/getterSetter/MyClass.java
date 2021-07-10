package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {

    public static void main(String[] args) {
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

        System.out.println(microphone.showDescription());

    }



}
