package ru.itgirlschool.zoo.entity;

public abstract class AbstractAnimal {
    public abstract void eat();

    public void hunt() {
        System.out.println("Я хищник и я охочусь");
    }
}