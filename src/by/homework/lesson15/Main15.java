package by.homework.lesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main15 {
    public static void main(String[] args) {

        /*1.3.Создать сотрудников (создайте штук восемь) */
        Employee realMan1 = new Employee(91, "Вася", "Васин", 42, 1000);
        Employee realMan2 = new Employee(92, "Петя", "Петин", 23, 500);
        Employee realMan3 = new Employee(93, "Коля", "Колин", 37, 900);
        Employee realMan4 = new Employee(94, "Артур", "Артуров", 24, 600);
        Employee realMan5 = new Employee(95, "Марк", "Марков", 25, 700);
        Employee realMan6 = new Employee(96, "Захар", "Захаров", 33, 800);
        Employee realMan7 = new Employee(97, "Лев", "Левин", 38, 1100);
        Employee realMan8 = new Employee(98, "Рома", "Ромов", 44, 1300);
        Employee realMan9 = new Employee(99, "Лёша", "Лёшин", 26, 750);

        /*1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.*/
        Map<Employee, String> mapEmployee = new HashMap<>();
        mapEmployee.put(realMan1, "прораб");
        mapEmployee.put(realMan2, "плотник");
        mapEmployee.put(realMan3, "электрик");
        mapEmployee.put(realMan4, "электрик");
        mapEmployee.put(realMan5, "бухгалтер");
        mapEmployee.put(realMan6, "экономист");
        mapEmployee.put(realMan7, "электрик");
        mapEmployee.put(realMan8, "режиссер");
        mapEmployee.put(realMan9, "плотник");


        System.out.println(mapEmployee);
        System.out.println("----------------------1.5----------------------------------");
        raiseSalaryForProfession(mapEmployee, "плотник", 200);
        raiseSalaryForProfession(mapEmployee, "электрик", 100);
        raiseSalaryForProfession(mapEmployee, "режиссер", -100);
        System.out.println(mapEmployee);
        System.out.println("----------------------1.6----------------------------------");
        System.out.println(changeKeyValue(mapEmployee));
    }

    /*1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии. Сигнатура метода к примеру такая.
    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).
    Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).*/
    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        Set<Map.Entry<Employee, String>> entries = employees.entrySet();
        for (Map.Entry<Employee, String> node : entries) {
            Employee employee = node.getKey();
            if (node.getValue().equals(profession)) {
                int newSalary = employee.getSalary() + amountOfIncrease;
                employee.setSalary(newSalary);
            }
        }
    }

    /*1.6*. Необходимо написать метод, который будет из мапки описанной в п.2.4 создаст мапку типа HashMap<String, Collection<Сотрудник>>.
    Т.е, поменять местами Квалифакацию и сотрудника( в качестве ключа будет выступать квалификация, в качестве значения-коллекция сотрудников). */
    private static Map<String, Employee> changeKeyValue(Map<Employee, String> employees){
        Map<String, Employee> changeEmployee = new HashMap<>();
        Set<Map.Entry<Employee, String>> entries = employees.entrySet();
        for (Map.Entry<Employee, String> node : entries) {
            changeEmployee.put(node.getValue(), node.getKey());
        }
        return changeEmployee;
    }
}
