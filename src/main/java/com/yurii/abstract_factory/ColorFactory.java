package com.yurii.abstract_factory;

public class ColorFactory extends AbstarctShapeFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        if (color.equalsIgnoreCase("GRAY")) {
            return new Gray();
        }
        return null;
    }
}
