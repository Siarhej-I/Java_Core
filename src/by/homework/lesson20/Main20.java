package by.homework.lesson20;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды,
результат выполнения –коллекция имен файлов.
Запустить 10 задач параллельно в пуле из 3 потоков.
Вывести ход программы на экран с указанием имени потока, который выполняет работу.*/

public class Main20 {
    public static void main(String[] args) {

        SomeFiles someFiles0 = new SomeFiles();
        SomeFiles someFiles1 = new SomeFiles();
        SomeFiles someFiles2 = new SomeFiles();
        SomeFiles someFiles3 = new SomeFiles();
        SomeFiles someFiles4 = new SomeFiles();
        SomeFiles someFiles5 = new SomeFiles();
        SomeFiles someFiles6 = new SomeFiles();
        SomeFiles someFiles7 = new SomeFiles();
        SomeFiles someFiles8 = new SomeFiles();
        SomeFiles someFiles9 = new SomeFiles();

        ExecutorService es = Executors.newFixedThreadPool(3);

        Future<List<String>> fFule0 = es.submit(someFiles0);
        Future<List<String>> fFule1 = es.submit(someFiles1);
        Future<List<String>> fFule2 = es.submit(someFiles2);
        Future<List<String>> fFule3 = es.submit(someFiles3);
        Future<List<String>> fFule4 = es.submit(someFiles4);
        Future<List<String>> fFule5 = es.submit(someFiles5);
        Future<List<String>> fFule6 = es.submit(someFiles6);
        Future<List<String>> fFule7 = es.submit(someFiles7);
        Future<List<String>> fFule8 = es.submit(someFiles8);
        Future<List<String>> fFule9 = es.submit(someFiles9);

        try {
            fFule0.get();
            fFule1.get();
            fFule2.get();
            fFule3.get();
            fFule4.get();
            fFule5.get();
            fFule6.get();
            fFule7.get();
            fFule8.get();
            fFule9.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        es.shutdown();
    }
}
