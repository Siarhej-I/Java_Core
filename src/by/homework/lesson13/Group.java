package by.homework.lesson13;

import java.util.Iterator;
import java.util.List;

public class Group {
    /*У группы: номер группы, коллекция студентов (List<Student> students) */
    private int idGroup;
    private List<Student> students;

    public Group(int idGroup, List<Student> students) {
        this.idGroup = idGroup;
        this.students = students;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /*1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех,
    у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
    Сигнатура метода: public void removeStudentsByMark(int mark);*/
    public void removeStudentsByMark(int mark) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student stud = it.next();
            if (stud.getAvgMark() < mark) {
                it.remove();
            }
        }
    }

    /*1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll());
    Сигнатура метода: public void transferToGroup(Group newGroup);*/
    public void transferToGroup(Group newGroup) {
        if (this.students.size() < 2) {
            newGroup.students.addAll(this.students);
        }
    }

    /*1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.*/
    public double avgMarkInGroup() {
        double avgMarkInGroup = 0, sum = 0;
        for (Student s : this.students) {
            sum += s.getAvgMark();
        }
        return avgMarkInGroup = sum / this.students.size();
    }
}
