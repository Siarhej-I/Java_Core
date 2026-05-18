package by.homework.lesson6;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива. " +
                "\nНовый минимальный элемент будет (-1000), новый максимальный элемент 1000.");

        int array[] = {2, 4, 22, 1, 6, -10, 19};
        System.out.println("2 4 22 1 6 -10 19");
        int min = 1000, max = -1000, minI = 0, maxI = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minI = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxI = i;
            }
        }
        array[minI] = -1000;
        array[maxI] = 1000;

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
