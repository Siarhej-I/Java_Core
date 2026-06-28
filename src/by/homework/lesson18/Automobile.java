package by.homework.lesson18;

public class Automobile extends Thread {

    /*1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки.
    Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле). */
    private String name;
    private int govNumber;
    private int timeStop;

    public Automobile(String name, int govNumber, int timeStop) {
        this.name = name;
        this.govNumber = govNumber;
        this.timeStop = timeStop;
    }

    public Automobile(String name, int govNumber) {
        this.name = name;
        this.govNumber = govNumber;
    }

    public void go() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
           Thread.sleep(timeStop);
            System.out.println("Машина " + name + " с гос. номером " + govNumber + " едет");
        }
    }

    @Override
    public void run() {
        try {
            go();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
