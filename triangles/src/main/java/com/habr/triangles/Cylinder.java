package com.habr.triangles;

public class Cylinder extends  SolidOfRevolution {
    double height;

    public Cylinder(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }
}
