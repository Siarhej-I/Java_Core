package by.homework.lesson6;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("2. Создать массив из 5 чисел и заполните этот массив вручную. " +
                "\nСоздайте второй массив с размерностью больше на 1 чем первый массив. " +
                "\nНеобходимо скопировать первый массив со всеми значениями во второй массив. " +
                "\nПоследний элемент во втором массиве пусть будет 0. " +
                "\nВыведите второй массив в консоль с помощью цикла for each.");

        int array1[] = {2, 4, 9, 1, 6, 10};
        System.out.println("2 4 9 1 6 10");
        int array2[] = new int[array1.length + 1];
        for (int j = 0; j < array1.length; j++) {
            array2[j] = array1[j];
        }

        array2[array2.length - 1] = 0;

        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
