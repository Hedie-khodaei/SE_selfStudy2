package session8.mft2;

public class Main {
    public static void main(String[] args) {

        Circle circle =new Circle(10);
        Squar squar = new Squar(5);
        RectAngle rectangle = new RectAngle(10,8);

        System.out.println(circle.getArea());
        System.out.println(squar.getArea());
        System.out.println(rectangle.getArea());
    }
}
