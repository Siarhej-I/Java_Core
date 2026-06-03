package by.homework.lesson12;

/*1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle. */
public class Garage<T extends Vehicle> {
    private T vehicle;

    /*1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости
    от количество выбросов транспортного средства. (Boolean isEntryPermitted());
    Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.*/

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEntryPermitted(){
        if (vehicle.getCountEmissions() < 100){
            System.out.println("с количеством выбросов "+ vehicle.getCountEmissions()+" въезд разрешен");
            return true;
        }
        System.out.println("с количеством выбросов "+ vehicle.getCountEmissions()+" въезд запрещен");
        return false;
    }
}
