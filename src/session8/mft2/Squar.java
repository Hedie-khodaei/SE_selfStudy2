package session8.mft2;

public class Squar implements Shape {

    private float side;


    public Squar(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public Squar setSide(float side) {
        this.side = side;
        return this;
    }

    @Override
    public float getArea() {
        return side*side;
    }

    @Override
    public float getPeremeter() {
        return side*4;
    }
}
