package session6;

public class Circle {
    private int radius;

    public Circle(int radius) {
        if (radius < 0) {
            System.out.println("radius is less than zero");
        } else {
            this.radius = radius;
        }

    }

        public int getRadius () {
            return radius;
        }

        public Circle setRadius ( int radius){
            this.radius = radius;
            return this;
        }

        float circleArea () {

            return radius * radius * 3.14f;
        }

        Float mohit () {
            return radius * radius * 3.14f;

        }

}
