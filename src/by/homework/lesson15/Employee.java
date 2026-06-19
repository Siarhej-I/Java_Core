package by.homework.lesson15;

public class Employee {
    /*1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата. */
    private int id;
    private String name;
    private String surname;
    private int age;
    private int salary;

    public Employee(int id, String name, String surname, int age, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[Сотрудник: табельный номер " + id + ", имя: " + name + ", фамилия: " + surname + ", возраст: " + age + " лет, ЗП: " + salary+"] ";
    }
}
