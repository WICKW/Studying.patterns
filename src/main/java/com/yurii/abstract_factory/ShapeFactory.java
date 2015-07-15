package com.yurii.abstract_factory;

public class ShapeFactory extends AbstarctShapeFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if(shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if(shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shape.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
