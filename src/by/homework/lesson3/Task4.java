package by.homework.lesson3;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Даны значения: x=5; y=2; c=x*y; \n" +
                "составьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с равнялось 12, \n" +
                "x=равнялось 6, y=1 Выведите полученные значения в консоль.");
        int x = 5, y = 2, c;
        c = ++x * y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("'c = ++x * y--' = " + c);
    }
}
