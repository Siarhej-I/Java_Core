package by.homework.lesson6;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each). " +
                "\nЗамените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 3 - 2;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------------------------------");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                array[i] = 0;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
