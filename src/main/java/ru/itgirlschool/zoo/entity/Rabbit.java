package ru.itgirlschool.zoo.entity;

public class Rabbit extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("Я кролик и я ем траву");
    }

    @Override
    public void hunt() {
        System.out.println("Я кролик и я не хищник, поэтому не охочусь");
    }
}