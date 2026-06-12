package by.homework.Lesson14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    /*1.3 У отделения поля: наименование отделения, список палат (коллекция Set)*/
    private String nameDep;
    private Set<Ward> wards = new HashSet<>();

    public Department(String nameDep) {
        this.nameDep = nameDep;
    }

    public void addWards(Ward ward) {
        wards.add(ward);
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }

    /*1.5 Посчитать количество мужчин и женщин в отделении.*/
    public void countMan() {
        int m = 0, f = 0;
        for (Ward w : wards) {
            for (Patient p : w.getPatients()) {
                if (p.getSex() == Sex.MALE) {
                    m++;
                } else {
                    f++;
                }
            }
        }
        System.out.println("В отделении находится " + f + " женщин и " + m + " мужчин");
    }
}
