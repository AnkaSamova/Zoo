package ru.itgirlschool.zoo.entity;

public class Bear extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("Я медведь и я ем рыбу и ягоды");
    }

    @Override
    public void hunt() {
        super.hunt();
        System.out.println("Я медведь, и я могу охотиться на рыбу, а могу просто есть ягоды)");
    }
}