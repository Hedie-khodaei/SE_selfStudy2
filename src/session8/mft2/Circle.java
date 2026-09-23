package session8.mft2;

import session8.mft1.Person;

import java.io.Serializable;

public class Circle  implements Shape,Serializable {


    public Circle(float radius) {
        this.radius = radius;
    }

    private float radius;

    public float getRadius() {
        return radius;
    }

    public Circle setRadius(float radius) {
        this.radius = radius;
        return this;
    }
    @Override
    public float getArea() {
        return radius * radius*3.14f;
    }

    @Override
    public float getPeremeter() {
        return radius*2*3.14f;
    }
}
