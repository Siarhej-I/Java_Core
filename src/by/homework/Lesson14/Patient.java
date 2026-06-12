package by.homework.Lesson14;

import java.util.Objects;

public class Patient implements Comparable {
    /*1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).*/
    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Sex sex;

    public Patient(int id, String name, String surname, String diagnosis, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.sex = sex;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Patient patient)) return false;
        return age == patient.age && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(diagnosis, patient.diagnosis) && sex == patient.sex;
    }

    @Override
    public int hashCode() {
        int hash = name.length() + surname.length() + diagnosis.hashCode() + age + sex.hashCode();
        return hash ;
    }

    /*1.8*. Сортировать пациентов по идентификационному номеру. (коллекция TreeSet, интерфейс Comparable)
    Для этого в классе Палата пациенты должны лежать в коллекции TreeSet.
    А класс пациент должен имплементировать интерфейс Comparable*/
    @Override
    public int compareTo(Object o) {
        return id;
    }
}
