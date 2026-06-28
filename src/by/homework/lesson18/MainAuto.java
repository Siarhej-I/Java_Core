package by.homework.lesson18;

public class MainAuto {
    public static void main(String[] args) {
//        parallelGo();
//        goWithStop();
        goWithJoin();
    }

    /*1.1 Создать два потока (две машины которые будут ехать параллельно).
    Потоки запускайте в классе Main.
    Выносите методы в private static void согласно заданиям.*/

    private static void parallelGo(){
        Automobile auto1 = new Automobile("ford", 5929);
        Automobile auto2 = new Automobile("audi", 6327);
        auto1.start();
        auto2.start();
    }

    /*1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep).
    Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки).
    В последствии поток будет спать переданное время. */
    private static void goWithStop(){
        Automobile auto1 = new Automobile("ford", 5929,200);
        Automobile auto2 = new Automobile("audi", 6327,300);
        auto1.start();
        auto2.start();
    }

    /*1.3 Запустить три потока с машинами.
    При этом 2 машины начнут двигаться только после того, как 1 машина прекратит езду (прекратит выполнение потока) (метод join) */
    private static void goWithJoin(){
        try {
            Automobile auto1 = new Automobile("ford", 5929);
            Automobile auto2 = new Automobile("audi", 6327);
            Automobile auto3 = new Automobile("VW", 8624);
            auto1.start();
            auto1.join();
            auto2.start();
            auto3.start();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
