package by.homework.lesson16;

import java.util.Set;

public class Bank {
    /*2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)*/
    private Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    /*5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой. Сигнатура метода будет такая:
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount)
    5.3 Соответсвтенно выполните логику перевода денег в белорусской валюте (отнимаете переводимую сумму со счёта,
    с которого идёт перевод и прибавляете сумму перевода счёту,на который происходит перевод.
    При этом сначала надо найти счета по переданным номерам в банке.*/
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double accountAmount) {
        Account numberFrom = null, numberTo = null;
        for (Account a : accounts) {
            if (a.getNumber().equals(accountNumberFrom)) {
                numberFrom = a;
            }
            if (a.getNumber().equals(accountNumberTo)) {
                numberTo = a;
            }
        }
        /*5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги,
        выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account*/
        if (numberFrom == null || numberTo == null) {
            throw new AccountNotFoundException("not.found.account");
        }
        /*5.2 Если на счёте, с которого переводят деньги,
        сумма меньше переводимой то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.*/
        if (numberFrom.getAmount() < accountAmount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }
        if (numberFrom.getCurrency().equals("BYN") && numberTo.getCurrency().equals("BYN")) {
            numberFrom.setAmount(numberFrom.getAmount() - accountAmount);
            numberTo.setAmount(numberTo.getAmount() + accountAmount);
        } else System.out.println("Перевод денег в валюте, отличной от BYN, выполняется с конверсией.");
    }

    /*9.*В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать со счетами, у которых разные валюты (USD и BYN).
    Сигнатура метода такая: public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate).
    exchangeRate это курсовая разница между доларом и белорусским рублём. Проверки выполните те же что и в пункте 5.*/
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double accountAmount, double exchangeRate) {
        Account numberFrom = null, numberTo = null;
        for (Account a : accounts) {
            if (a.getNumber().equals(accountNumberFrom)) {
                numberFrom = a;
            }
            if (a.getNumber().equals(accountNumberTo)) {
                numberTo = a;
            }
        }
        if (numberFrom == null || numberTo == null) {
            throw new AccountNotFoundException("not.found.account");
        }
        if (numberFrom.getAmount() < accountAmount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }
        if (numberFrom.getCurrency().equals(numberTo.getCurrency())) {
            numberFrom.setAmount(numberFrom.getAmount() - accountAmount);
            numberTo.setAmount(numberTo.getAmount() + accountAmount);
        } else {
            numberFrom.setAmount(numberFrom.getAmount()*exchangeRate - accountAmount);
            numberTo.setAmount(numberTo.getAmount()/exchangeRate + accountAmount);
        }

    }
}
