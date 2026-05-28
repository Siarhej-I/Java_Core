package by.homework.lesson9;

import java.util.Objects;

public class Bird extends Animal {

    private String family;  //семейство
    private int maxHeight; //максимальная высота полёта

    public Bird() {
    }

    public Bird(int id, String color, int yearsLife, String typeFood, String family, int maxHeight) {
        super(id, color, yearsLife, typeFood);
        this.family = family;
        this.maxHeight = maxHeight;
    }

    /*В классе птица методы-петь, клевать, высиживать птенцов.
При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).*/

    @Override
    public void makeSounds() {
        System.out.println("Птица семейства " + this.family + " красиво поёт");
    }

    public void peck() {
        System.out.println("Птица семейства " + this.family + " клюёт");
    }

    public void hatch() {
        System.out.println("Птица семейства " + this.family + " высиживает птенцов");
    }

    @Override
    public void animalPlay() {
        System.out.println("Птица семейства " + this.family + " прикольно играет");
    }

    public String toString() {
        String info = super.toString();
        info = info + "\nСемейство: " + family + "\nМаксимальная высота полёта: " + maxHeight;
        return info;
    }

    public String getFamily() {
        return family;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) o;
        if (family.equals(((Bird) o).getFamily()) && (maxHeight == ((Bird) o).getMaxHeight())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = family.hashCode() * maxHeight;
        return hash;
    }
}
