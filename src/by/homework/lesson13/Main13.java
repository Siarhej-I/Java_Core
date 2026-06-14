package by.homework.lesson13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main13 {
    public static void main(String[] args) {

        /*--------1.1. Создать несколько студентов.------------*/
        Student stud1 = new Student("Василий", "Васильев", 2005, "Гродно", 7);
        Student stud2 = new Student("Пётр", "Петров", 2003, "Витебск", 8);
        Student stud3 = new Student("Иван", "Иванов", 2006, "Туров", 7);
        Student stud4 = new Student("Сидор", "Сидоров", 2001, "Барановичи", 9);
        Student stud5 = new Student("Алексей", "Алексеев", 2007, "Мозырь", 9);
        Student stud6 = new Student("Джон", "Джонович", 2006, "Глубокое", 6);

        /*---------1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)-----------*/
        List<Student> st401 = new ArrayList<>();
        List<Student> st402 = new ArrayList<>();
        List<Student> st403 = new ArrayList<>();
        st401.add(stud1);
        st401.add(stud4);
        st401.add(stud6);
        st402.add(stud2);
        st402.add(stud5);
        st403.add(stud3);
        Group gr401 = new Group(401, st401);
        Group gr402 = new Group(402, st402);
        Group gr403 = new Group(403, st403);

        /*---------1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)-------------*/
        List<Group> fk = new ArrayList<>();
        fk.add(gr401);
        fk.add(gr402);
        fk.add(gr403);
        Faculty fity = new Faculty("ФИТУ", fk, FacultyStatus.ACTIVE);

        /*1.4. Реализовать метод, который должен удалить тех, у кого средний бал ниже переданной оценки */
        gr401.removeStudentsByMark(7);
        gr402.removeStudentsByMark(8);
        gr403.removeStudentsByMark(7);

        /*1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу*/
        gr403.transferToGroup(gr401);

        /*1.6. Реализовать метод в классе Group, который считает средний бал по группе.*/
        System.out.println("В группе " + gr401.getIdGroup() + " средний бал: " + gr401.avgMarkInGroup());
        System.out.println("В группе " + gr402.getIdGroup() + " средний бал: " + gr402.avgMarkInGroup());
        System.out.println("В группе " + gr403.getIdGroup() + " средний бал: " + gr403.avgMarkInGroup());

        /*1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным.
        (Метод size() в коллекции)*/
        System.out.println("Статус факультета до проверки количества студентов: " + fity.getStatus());
        fity.changeFacultyStatus();
        System.out.println("Статус факультета после проверки количества студентов: " + fity.getStatus());

        /*1.9*. Вывести студентов в порядке возрастания среднего бала
         1.10*. Вывести студентов в порядке убывания среднего бала.0*/
        //формирование единой коллекции Student
        List<Student> stAll = new ArrayList<>();
        for (Group g : fk) {
            for (Student s : g.getStudents()){
                stAll.add(s);
            }
        }
        //коллекция в массив
        Student[] stArray = new Student[stAll.size()];
        stArray = stAll.toArray(stArray);
        //сортировка пузырьком
        for (boolean bol = false; !bol; ) {
            bol = true;
            for (int i = 0; i < stArray.length - 1; i++) {
                Student temp;
                if (stArray[i].getAvgMark() > stArray[i + 1].getAvgMark()) { //знак "<" - сортировка по убыванию
                    bol = false;
                    temp = stArray[i];
                    stArray[i] = stArray[i + 1];
                    stArray[i + 1] = temp;
                }
            }
        }
        for (Student s : stArray) {
            System.out.println(s);
        }
    }
}
