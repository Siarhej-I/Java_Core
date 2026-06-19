package by.homework.lesson16;

import java.util.Objects;

public class Account {
    /*1. Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double).
    Выполнить переопределение equals и hashcode по двум полям (id и номер счёта),
    так как логически, эти поля будут уникальными для каждого счёта.*/
    private int id;
    private String number;
    private String currency;
    private Double amount;

    public Account(int id, String number, String currency, Double amount) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return id == account.id && Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return number.hashCode() - id;
    }

    @Override
    public String toString() {
        return "Счет [id: " + id + ", номер счёта: " + number +", валюта: " + currency + ", сумма: " + amount + "]\n";
    }
}
