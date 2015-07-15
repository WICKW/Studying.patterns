package com.yurii.abstract_factory;

public class App {
    public static void main(String[] args) {

        AbstarctShapeFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shapeA = shapeFactory.getShape("RECTANGLE");
        shapeA.draw();

        Shape shapeB = shapeFactory.getShape("TRIANGLE");
        shapeB.draw();

        Shape shapeC = shapeFactory.getShape("CIRCLE");
        shapeC.draw();

        AbstarctShapeFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color colorA = colorFactory.getColor("GREEN");
        colorA.fill();

        Color colorB = colorFactory.getColor("GRAY");
        colorB.fill();

    }
}
