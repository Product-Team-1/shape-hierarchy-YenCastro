package com.example.project;

// Se agreran los atributos privados
public class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    // Método sobreescrito con override
    @Override
    public double getArea() {
        if (width <= 0 || height <= 0) {
            return 0;
        }
        return width * height;
    }
}
