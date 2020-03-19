package com.habr.triangles;

public class Runner {
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2,2);
        Pyramid pyramid = new Pyramid(100,10);

        Box box = new Box(150);
        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}
