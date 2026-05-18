package by.homework.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("На вход даны 3 числа. Вывести в консоль только четные числа");
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите x");
        int x = vvod.nextInt();
        System.out.println("Введите y");
        int y = vvod.nextInt();
        System.out.println("Введите z");
        int z = vvod.nextInt();
        if (x%2==0) System.out.println("x четное");
        if (y%2==0) System.out.println("y четное");
        if (z%2==0) System.out.println("z четное");
    }
}
