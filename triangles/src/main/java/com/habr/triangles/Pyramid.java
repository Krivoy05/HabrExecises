package com.habr.triangles;

public class Pyramid implements Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return h*s*4/3;
    }
}
