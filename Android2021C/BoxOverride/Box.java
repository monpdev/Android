package monp.example.learnjava;

public class Box extends Rectangle {

    private int height;

    //constructor

    public Box(int length, int width, int height){
        super(length, width);
        this.height = height;
    }

    //getters and setters


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return 2 * ( getLength() * getWidth() + getLength() * height + getWidth() * height );

    }


}
