package by.homework.lesson16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main16 {
    public static void main(String[] args) {
        /*6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)*/
        Account acc1 = new Account(231, "BY11BPSB30100000933", "BYN", 432.1);
        Account acc2 = new Account(913, "BY12BPSB30110000878", "EUR", 847.18);
        Account acc3 = new Account(578, "BY13BPSB30120000985", "ZLT", 654.93);
        Account acc4 = new Account(942, "BY14BPSB30130000840", "USD", 129.4);
        Account acc5 = new Account(112, "BY15BPSB30140000933", "BYN", 721.06);

        Set<Account> setAcc = new HashSet<>();
        setAcc.add(acc1);
        setAcc.add(acc2);
        setAcc.add(acc3);
        setAcc.add(acc4);
        setAcc.add(acc5);

        Bank bank = new Bank(setAcc);
        System.out.println(bank.getAccounts());
        /*7. В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт.
        При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
        7.3 В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.*/
        try {
            bank.transferMoney("BY11BPSB30100000933","BY13BPSB30120000985",10.6);
            bank.transferMoney("BY12BPSB30110000878", "BY14BPSB30130000840", 100.2, 0.8);
        } catch (AccountNotFoundException accNo){
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException noMoney){
            System.out.println("Недостаточно средств для перевода");
        }
        /*8. Добавьте блок finally. В блоке finally выведите в консоли «Спасибо,что вопользовались услугами банка»*/
        finally {
            System.out.println("Спасибо,что воспользовались услугами банка");
        }
        System.out.println(bank.getAccounts());
    }
}
