package com.example.project;

import java.util.ArrayList;

public class ShapeHierarchy {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Rectangle(10, 10));
        shapes.add(new Triangle(8, 3));
        shapes.add(new Circle(2.5));
        shapes.add(new Rectangle(10, 2));

        for (Shape shape : shapes) {
            System.out.println("Área: " + shape.getArea());
        }
    }
}
