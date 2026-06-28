package by.homework.lesson18.runnable;

import by.homework.lesson18.Automobile;

public class Main {
    public static void main(String[] args) {
//        parallelGo();
        goWithStop();
    }

        /*1.1 Создать два потока (две машины которые будут ехать параллельно).
    Потоки запускайте в классе Main.
    Выносите методы в private static void согласно заданиям.*/

    private static void parallelGo(){
        Automobile auto1 = new Automobile("ford", 5929);
        Thread autoThread1 = new Thread(auto1);
        Automobile auto2 = new Automobile("audi", 6327);
        Thread autoThread2 = new Thread(auto2);
        autoThread1.start();
        autoThread2.start();
    }

    /*1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep).
    Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки).
    В последствии поток будет спать переданное время. */
    private static void goWithStop(){
        Automobile auto1 = new Automobile("ford", 5929,200);
        Thread autoThread1 = new Thread(auto1);
        Automobile auto2 = new Automobile("audi", 6327,300);
        Thread autoThread2 = new Thread(auto2);
        autoThread1.start();
        autoThread2.start();
    }
}
