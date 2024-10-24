package ru.itgirlschool.zoo._main;

import ru.itgirlschool.zoo.entity.Bear;
import ru.itgirlschool.zoo.entity.Lion;
import ru.itgirlschool.zoo.entity.Rabbit;
import ru.itgirlschool.zoo.util.AboutAnimals;

public class _Main {
    public static void main(String[] args) {
        Bear bear = new Bear();
        Lion lion = new Lion();
        Rabbit rabbit = new Rabbit();
        AboutAnimals aboutAnimals = new AboutAnimals();
        System.out.println("Сейчас животные расскажут, что они едят:");
        aboutAnimals.whatEat(bear);
        aboutAnimals.whatEat(lion);
        aboutAnimals.whatEat(rabbit);
        System.out.println(" ");
        System.out.println("А сейчас животные расскажут, как они добывают еду:");
        System.out.println("Медведь:");
        aboutAnimals.howHunt(bear);
        System.out.println("Лев:");
        aboutAnimals.howHunt(lion);
        System.out.println("Кролик:");
        aboutAnimals.howHunt(rabbit);
    }
}