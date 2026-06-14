package by.homework.Lesson14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ward {
    /*1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов */
    private int number;
    private Sex type;
    //  private Set<Patient> patients = new HashSet<>(); //в этой коллекции работают equals() и hashCode() переопределенные Patient
    private TreeSet<Patient> patients = new TreeSet<>();

    public Ward(int number, Sex type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(TreeSet<Patient> patients) {
        this.patients = patients;
    }

    /*1.6 Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами.
    Метод реализовать в классе Палата.*/
    public void addPatient(Patient patient, String diagnos) {
        if (diagnos.equals(patient.getDiagnosis())) {
            patients.add(patient);
        }
    }

    /*1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.*/
    @Override
    public String toString() {
        String info = "";
        for (Patient p : patients) {
            info += "[ " + p.getId() + " " + p.getName() + " " + p.getSurname() + " " + p.getSex() + " " + p.getAge() + " года. С диагнозом: " + p.getDiagnosis() + " ]";
        }
        return "В палате номер " + number + " лежат пациенты: " + info;
    }
}
