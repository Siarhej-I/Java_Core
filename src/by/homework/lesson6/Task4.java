package by.homework.lesson6;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. " +
                "\nВывести полученный массив. Выполнить с помощью цикла for");

        System.out.println("3 6 8 2 0 1 7");
        int array[] = {3, 6, 8, 2, 0, 1, 7};
        //boolean bol = false;
        for (boolean bol = false; !bol; ) {
            bol = true;
            for (int i = 0; i < array.length - 1; i++) {
                int temp;
                if (array[i] < array[i + 1]) {
                    bol = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
