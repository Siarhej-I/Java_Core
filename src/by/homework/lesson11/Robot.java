package by.homework.lesson11;

public interface Robot {
    /*1. Создать интерфейс Робот. В нём определены методы:
    Дефолтный метод:  Отремонтировать робота и
    абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).*/

    default void repair() {
        System.out.println("Ремонт");
    }

    boolean turnOn();

    boolean turnOff();

    String uniquePossibility();

    String getModel();
}
