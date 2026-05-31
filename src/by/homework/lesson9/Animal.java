package by.homework.lesson9;

public class Animal {

    private int id;         //Добавить поле в класс животное называемое номер (id)
    private String color;   //окрас
    private int yearsLife;  //продолжительность жизни
    private String typeFood;    //тип еды которой питаются (мясо, насекомые, растения)

    public Animal() {
    }

    public Animal(int id, String color, int yearsLife, String typeFood) {
        this.id=id;
        this.color = color;
        this.yearsLife = yearsLife;
        this.typeFood = typeFood;
    }

    /*Определить методы в классе животное: (издание звуков, животное играет)*/
    public void makeSounds() {
        System.out.println("Животное издает звуки");
    }

    public void animalPlay() {
        System.out.println("Животное играет");
    }

    public String toString() {
        String info = "";
        info = info + "\nЦвет: " + color + "\nПродолжительность жизни: " + yearsLife + "\nТип еды которой питается: " + typeFood;
        return info;
    }

    public int getId() {
        return id;
    }
}
