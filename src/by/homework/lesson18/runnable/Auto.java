package by.homework.lesson18.runnable;

public class Auto implements Runnable{

    private String name;
    private int govNumber;
    private int timeStop;

    public Auto(String name, int govNumber, int timeStop) {
        this.name = name;
        this.govNumber = govNumber;
        this.timeStop = timeStop;
    }

    public Auto(String name, int govNumber) {
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
