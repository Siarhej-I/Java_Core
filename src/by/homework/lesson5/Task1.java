package by.homework.lesson5;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println("Число "+ i + " кратно 3 или 7");
            }
        }
    }
}
