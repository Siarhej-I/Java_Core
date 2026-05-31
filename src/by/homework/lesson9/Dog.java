package by.homework.lesson9;

import java.util.Objects;

public class Dog extends Animal {

    private String name;    //кличка
    private String breed;   //порода
    private int avWeight;   //средний вес

    public Dog() {
    }

    public Dog(int id, String color, int yearsLife, String typeFood, String name, String breed, int avWeight) {
        super(id, color, yearsLife, typeFood);
        this.name = name;
        this.breed = breed;
        this.avWeight = avWeight;
    }

    /*В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
    При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает)*/

    @Override
    public void makeSounds() {
        System.out.println(this.name + " породы " + this.breed + " люто лает");
    }

    public void bite() {
        System.out.println(this.name + " породы " + this.breed + " больно кусает");
    }

    public void run() {
        System.out.println(this.name + " породы " + this.breed + " быстро бегает");
    }

    @Override
    public void animalPlay() {
        System.out.println(this.name + " породы " + this.breed + " весело играет");
    }

    public void jump() {
        System.out.println(this.name + " породы " + this.breed + " высоко прыгает");
    }

    public String toString() {
        String info = super.toString();
        info = info + "\nКличка: " + name + "\nПорода: " + breed + "\nСредний вес: " + avWeight;
        return info;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAvWeight() {
        return avWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAvWeight(int avWeight) {
        this.avWeight = avWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) o;
        if (name.equals(((Dog) o).getName()) && breed.equals(((Dog) o).getBreed())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = (name.hashCode()+breed.length())*avWeight;
        return hash;
    }
}
