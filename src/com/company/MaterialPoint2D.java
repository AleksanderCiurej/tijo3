package com.company;

public class MaterialPoint2D extends Point2D{
    private final double mass;

    public MaterialPoint2D(double x, double y, double mass) {
        super(x, y);
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "x = " + getX() + ",y = " + getY() + ",mass = " + mass;

    }
}
