package com.yurii.abstract_factory;

public class FactoryProducer {

    public static AbstarctShapeFactory getFactory(String option) {
        if (option.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        if (option.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
