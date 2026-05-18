package by.homework.lesson7;

public class StudendMain {
    public static void main(String[] args) {
        Student stud1 = new Student(1, "First", "FirstSur", "FITU", 3, "ftis", 7);

        System.out.println("*2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info");
        System.out.println(stud1.info());

        System.out.println("======================================================================================================" +
                "\n3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)" +
                "\n4. Создать метод, который будет возвращать текущую группу студента.");
        System.out.println("Группа до: " + stud1.currentGroup());
        stud1.changeGroup("ksis");
        System.out.println("Группа после: " + stud1.currentGroup());

        System.out.println("======================================================================================================" +
                "\n5. Создать метод, который будет изменять оценку студента и группу");
        stud1.changeGroup("tris", 8);
        System.out.println(stud1.info());

        /*6. В классе main создать массив из пяти студентов.*/
        Student[] students = {//Student[5];
                new Student(1, "First", "FirstSur", "FITU", 3, "ftis", 7),
                new Student(2, "Second", "SecondSur", "KSIS", 2, "ftor", 9),
                new Student(3, "Three", "ThreeSur", "FITU", 3, "ftis", 6),
                new Student(4, "Four", "FourSur", "FITU", 4, "fot", 8),
                new Student(5, "Five", "FiveSur", "FPMI", 1, "fkot", 10)
        };

        System.out.println("8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info" +
                "\n=============================================================================================================================");
        Student ob = new Student();
        //ob.getStudents(students, 7);
        for (Student i : ob.getStudents(students, 8)) {
            if (i == null) {
                continue;
            }
            System.out.println(i.info());
        }
    }
}
