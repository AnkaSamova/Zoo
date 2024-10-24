package ru.itgirlschool.zoo.util;

import ru.itgirlschool.zoo.entity.AbstractAnimal;

public class AboutAnimals {
    public void whatEat(AbstractAnimal abstractAnimal) {
        abstractAnimal.eat();
    }

    public void howHunt(AbstractAnimal abstractAnimal) {
        abstractAnimal.hunt();
    }
}