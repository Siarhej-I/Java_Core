package by.homework.lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("3* . Ввести число с консоли, которое не заканчивается на 0.Вывести число в обратном порядке. Использовать оператор %. ");

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число");
        int ch = vvod.nextInt();

        int min = 100, max = 0;

        if (ch % 10 == 0) {
            System.out.println("Число не должно заканчиваться на 0");
        } else {
            while (ch > 0) {
                int a = ch % 10;
                System.out.print(a);
                ch /= 10;
            }
        }
    }
}