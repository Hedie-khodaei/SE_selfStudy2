package session8.mft2;

public class RectAngle implements Shape {

    private int width;
    private int height;


    public RectAngle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public RectAngle setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public RectAngle setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public float getArea()throws Exception {
        return width*height;
    }

    @Override
    public float getPeremeter()throws Exception {
        return 2* (width + height);
    }
}
