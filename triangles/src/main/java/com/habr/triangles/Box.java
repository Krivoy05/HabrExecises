package com.habr.triangles;

import java.io.IOException;
import java.util.ArrayList;

public class Box implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        this.available = available;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    public double getVolume() {
        return available;
    }

    public boolean add(Shape figure)  {
        if (available >= figure.getVolume()) {
            shapes.add(figure);
            available -= figure.getVolume();
            return true;
        }
        return false;
    }
}
