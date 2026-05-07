package by.homework.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5 \n" +
                "(используйте оператор % для проверки деления без остатка)");
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите x");
        int x = vvod.nextInt();
        System.out.println("Введите y");
        int y = vvod.nextInt();
        System.out.println("Введите z");
        int z = vvod.nextInt();
        if (x % 2 == 0 && x % 5 == 0) System.out.println("x делится без остатка на 2 и на 5");
        if (y % 2 == 0 && x % 5 == 0) System.out.println("y делится без остатка на 2 и на 5");
        if (z % 2 == 0 && x % 5 == 0) System.out.println("z делится без остатка на 2 и на 5");
    }
}
