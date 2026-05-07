package by.homework.lesson3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5 \n" +
                "иначе, присвоить числу c значение 10. (тернарный оператор)");
        int a = 35, b = 65, c;
        c = (a > b) ? 5 : 10;
        System.out.println("Значение выражения 'c = (a > b) ? 5 : 10' = " + c);
    }
}
