package by.homework.lesson13;

public class Student {
    /*У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.*/
    private String name;
    private String surname;
    private int dateOfBirth;
    private String cityOfBirth;
    private int avgMark;

    public Student(String name, String surname, int dateOfBirth, String cityOfBirth, int avgMark) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.avgMark = avgMark;
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

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public int getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(int avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        String info = "Студент: " + name + " " + surname + " |Родился " + dateOfBirth + " " + " в городе " + cityOfBirth + " |Средняя оценка: " + avgMark;
        return info;
    }
}
