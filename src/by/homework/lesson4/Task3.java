package by.homework.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления. \n" +
                "Написать программу, которая будет выводит разный текст, в зависимости от значения result. \n" +
                "В случае result=3, вывести: \"Результат деления равен 3\" \n" +
                "В случае result=5 вывести: \"Результат деления равен 5\" \n" +
                "В других случаях вывести: \"Результат деления равен дробному числу\". \n" +
                "При этом в последнем случае вывести точный результат деления (использовать приведение типов) \n" +
                "Для выполнения задания использовать оператор switch- case ");
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите x");
        int x = vvod.nextInt(), result = 15 / x;
        switch (result) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу " + ((float)15/x));
        }
    }
}
