package com.yurii.abstract_factory;

public abstract class AbstarctShapeFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
