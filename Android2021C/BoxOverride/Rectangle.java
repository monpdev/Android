package monp.example.learnjava;

public class Rectangle {
    //instance variables/properties/fields
    private int length;
    private int width;

    //Create a constructor
    public Rectangle(){}

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int area() {

        return this.getLength() * this.getWidth();
    }


}


