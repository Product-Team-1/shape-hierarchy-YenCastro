package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class ShapeHierarchy {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Rectangle(5, 9));
        shapes.add(new Triangle(2, 7));

        //Recorre cada objeto de tipo Shape que haya en la lista shapes
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
