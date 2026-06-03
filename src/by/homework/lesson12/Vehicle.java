package by.homework.lesson12;

public class Vehicle {

    /*1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора. */
    private String name;
    private int countEmissions;

    public Vehicle(String name, int countEmissions){
        this.name = name;
        this.countEmissions = countEmissions;
    }

    /*1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle*/
    public String getName() {
        return name;
    }

    public int getCountEmissions() {
        return countEmissions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountEmissions(int countEmissions) {
        this.countEmissions = countEmissions;
    }
}
