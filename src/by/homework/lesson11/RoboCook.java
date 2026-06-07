package by.homework.lesson11;

public class RoboCook implements Robot {
    /*РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn). */
    private String model;   //модель
    private int powerUse;  //потребляемая мощность
    private String fromCountry; //страна производитель
    private String cookingUnit; //агрегат для приготовления
    private boolean isOn;   //включение робота

    public RoboCook() {
    }

    public RoboCook(String model, int powerUse, String fromCountry, String cookingUnit, boolean isOn) {
        this.model = model;
        this.powerUse = powerUse;
        this.fromCountry = fromCountry;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    @Override
    public boolean turnOn() {
        System.out.println("Робот повар включен");
        return this.isOn = true;
    }

    @Override
    public boolean turnOff() {
        System.out.println("Робот повар выключен");
        return this.isOn = false;
    }

    /*1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.) */
    @Override
    public String uniquePossibility() {
        String str;
        return str = "Повар готовит!";
    }

    @Override
    public String toString() {
        String info = "";
        info = "Модеть: "+ model + " |Потребляемая мощность: " + powerUse + " |Cтрана производитель: " + fromCountry +
        " |Агрегат для приготовления: " + cookingUnit + " |Робот включен: " + isOn;
        return info;
    }

    public String getModel() {
        return model;
    }
}
