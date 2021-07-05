package monp.example.learnjava;

public class Rectangle {
    //instance variables/properties/fields
    int length;
    int width;

    //Create a constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }


    public int area(){
        return this.length*this.width;
        }

    }


