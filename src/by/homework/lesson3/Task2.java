package by.homework.lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения, \n" +
                "чтобы результат не изменился. x=8; y=9; z=12; \n" +
                "(операции присваивания, нужно просто написать по-другому)");
        int x = 8, y = 9, z = 12;
        System.out.println("Значение (x += 5) = " + (x += 5));
        System.out.println("Значение (y *= 9) = " + (y *= 9));
        System.out.println("Значение (z -= 6) = " + (z -= 6));
    }
}
