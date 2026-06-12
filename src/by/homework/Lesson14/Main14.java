package by.homework.Lesson14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main14 {
    public static void main(String[] args) {

        /*1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум.
        При этом попробуйте добавит двух пациентов, с одинаковыми полями.
        Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode.
        Палаты распределить по отделениям.*/
        Patient patc1 = new Patient(91, "Иван", "Иванов", "скорлотина", 32, Sex.MALE);
        Patient patc2 = new Patient(92, "Петр", "Петров", "диатез", 5, Sex.MALE);
        Patient patc3 = new Patient(93, "Вера", "Егорова", "скорлотина", 41, Sex.FEMALE);
        Patient patc4 = new Patient(94, "Евламипий", "Евлампиевич", "протез", 36, Sex.MALE);
        Patient patc5 = new Patient(95, "Надежда", "Оглывовна", "диатез", 8, Sex.FEMALE);
        Patient patc6 = new Patient(96, "Любовь", "Олеговна", "протез", 36, Sex.FEMALE);
        Patient patc7 = new Patient(97, "Андрей", "Андреевич", "диатез", 11, Sex.MALE);
        Patient patc8 = new Patient(98, "Иван", "Иванов", "скорлотина", 32, Sex.MALE);

        Ward w1 = new Ward(1, Sex.FEMALE);
        Ward w2 = new Ward(2, Sex.MALE);
        Ward w3 = new Ward(3, Sex.MALE);

        w1.addPatient(patc1,"скорлотина");
        w1.addPatient(patc2,"скорлотина");
        w1.addPatient(patc3,"скорлотина");
        w1.addPatient(patc4,"скорлотина");
        w1.addPatient(patc5,"скорлотина");
        w1.addPatient(patc6,"скорлотина");
        w1.addPatient(patc7,"скорлотина");
        w1.addPatient(patc8,"скорлотина");

        w2.addPatient(patc1, "диатез");
        w2.addPatient(patc2, "диатез");
        w2.addPatient(patc3, "диатез");
        w2.addPatient(patc4, "диатез");
        w2.addPatient(patc5, "диатез");
        w2.addPatient(patc6, "диатез");
        w2.addPatient(patc7, "диатез");
        w2.addPatient(patc8, "диатез");

        w3.addPatient(patc1, "протез");
        w3.addPatient(patc2, "протез");
        w3.addPatient(patc3, "протез");
        w3.addPatient(patc4, "протез");
        w3.addPatient(patc5, "протез");
        w3.addPatient(patc6, "протез");
        w3.addPatient(patc7, "протез");
        w3.addPatient(patc8, "протез");

        /*1.5 Посчитать количество мужчин и женщин в отделении.*/
        Department department = new Department("Почти здоровы");
        department.addWards(w1);
        department.addWards(w2);
        department.addWards(w3);

        department.countMan();
        System.out.println("------------------------------------------------------------------------");

        /*1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.*/
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}
