package by.homework.lesson11;

public class RoboBuilder implements RoboEngineer {
    /*РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.) */
    private String model;   //модель
    private int powerUse;  //потребляемая мощность
    private String fromCountry; //страна производитель
    private String buildingUnit; //агрегат для строительства
    private String material; //материал
    private boolean isOn;   //включение робота

    public RoboBuilder() {
    }

    public RoboBuilder(String model, int powerUse, String fromCountry, String buildingUnit, String material, boolean isOn) {
        this.model = model;
        this.powerUse = powerUse;
        this.fromCountry = fromCountry;
        this.buildingUnit = buildingUnit;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public boolean turnOn() {
        System.out.println("Робот строитель включен");
        return this.isOn = true;
    }

    @Override
    public boolean turnOff() {
        System.out.println("Робот строитель выключен");
        return this.isOn = false;
    }

    /*1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.) */
    @Override
    public String uniquePossibility() {
        String str;
        return str = "Строитель строит!";
    }

    @Override
    public String createItem() {
        String str;
        return str = "Робот строитель создаёт бетон";
    }

    @Override
    public String toString() {
        String info = "";
        info = "Модеть: " + model + " |Потребляемая мощность: " + powerUse + " |Cтрана производитель: " + fromCountry +
                " |Агрегат для строительства: " + buildingUnit + " |материал: " + material + " |Робот включен: " + isOn;
        return info;
    }

    @Override
    public String getModel() {
        return model;
    }
}
