package by.homework.lesson13;

import java.util.Comparator;
import java.util.List;

public class Faculty {
    /*У факультета: наименование факультета, список групп (List<Group> groups. )*/
    private String nameFaculty;
    private List<Group> groups;
    /*1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.*/
    private FacultyStatus status;

    public Faculty(String nameFaculty, List<Group> groups) {
        this.nameFaculty = nameFaculty;
        this.groups = groups;
    }

    public Faculty(String nameFaculty, List<Group> groups, FacultyStatus status) {
        this.nameFaculty = nameFaculty;
        this.groups = groups;
        this.status = status;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public FacultyStatus getStatus() {
        return status;
    }

    public void setStatus(FacultyStatus status) {
        this.status = status;
    }

    /*1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным.
    (Метод size() в коллекции)*/
    public void changeFacultyStatus() {
        int sumStud = 0;
        for (Group g : this.groups) {
            sumStud += g.getStudents().size();
        }
        if (sumStud < 20) {
            setStatus(FacultyStatus.NOT_ACTIVE);
        }
    }
}
