package by.homework.lesson11;

public class RoboSapper implements RoboEngineer {
    /*РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)*/
    private String model;   //модель
    private int powerUse;  //потребляемая мощность
    private String mineAgent; //средство для разминирования (шасси номер)
    private String material; //материал
    private boolean isOn;   //включение робота

    public RoboSapper() {
    }

    public RoboSapper(String model, int powerUse, String mineAgent, String material, boolean isOn) {
        this.model = model;
        this.powerUse = powerUse;
        this.mineAgent = mineAgent;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void repair() {
        System.out.println("Ремонтировать робота сапёра");
    }

    @Override
    public boolean turnOn() {
        System.out.println("Робот сапёр включен");
        return this.isOn = true;
    }

    @Override
    public boolean turnOff() {
        System.out.println("Робот сапёр выключен");
        return this.isOn = false;
    }

    /*1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.) */
    @Override
    public String uniquePossibility() {
        String str;
        return str = "Сапёр разминирует";
    }

    @Override
    public String createItem() {
        String str;
        return str = "Робот сапёр создаёт приспособление для разминирования";
    }

    @Override
    public String toString() {
        String info = "";
        info = "Модеть: " + model + " |Потребляемая мощность: " + powerUse + " |средство для разминирования (шасси номер): " + mineAgent +
                " |материал: " + material + " |Робот включен: " + isOn;
        return info;
    }

    @Override
    public String getModel() {
        return model;
    }
}
