package com.habr.triangles;

public class Cylinder extends SolidOfRevolution {
    private double height;
    private double s;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
