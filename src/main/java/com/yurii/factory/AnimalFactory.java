package com.yurii.factory;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if (animalType.equals("dog")) {
            return new Dog();
        } else {
            return new Fox();
        }
    }
}
