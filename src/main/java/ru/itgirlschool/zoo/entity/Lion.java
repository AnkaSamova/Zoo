package ru.itgirlschool.zoo.entity;

public class Lion extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("Я лев и я ем мясо");
    }
}