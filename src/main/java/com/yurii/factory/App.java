package com.yurii.factory;

public class App {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal a = factory.getAnimal("fox");
        Animal b = factory.getAnimal("dog");
        Animal c = factory.getAnimal("any");

        System.out.println("Animal 'a' say: " + a.makeSound());
        System.out.println("Animal 'b' say: " + b.makeSound());
        System.out.println("Animal 'c' say: " + c.makeSound());
    }
}
