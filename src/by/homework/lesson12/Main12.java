package by.homework.lesson12;

public class Main12 {
    public static void main(String[] args) {

        /*1.5 Класс Main. Создать 2 объекта класса Garage.
        Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.*/

        Car car1 = new Car("Maserati", 101);
        Garage<Vehicle> veh1 = new Garage<>(car1);

        Motorcycle moto1 = new Motorcycle("Kavasaki", 10);
        Garage<Vehicle> veh2 = new Garage<>(moto1);

        System.out.print("Для " + car1.getName() + " ");
        veh1.isEntryPermitted();

        System.out.print("Для " + moto1.getName() + " ");
        veh2.isEntryPermitted();
    }
}
