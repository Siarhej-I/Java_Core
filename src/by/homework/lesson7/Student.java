package by.homework.lesson7;

/*1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ),
course(тип int) , Группа(тип String), средняя оценка (тип int).
Инициализацию студента в классе main выполнять через конструктор с параметрами.
Также определите конструктор без параметров. */
public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageRating;

    public Student() {

    }

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageRating) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageRating = averageRating;
    }

    /*2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info*/
    public String info() {
        String information = "№ " + this.id +
                "\nИмя: " + this.name +
                "\nФамилия: " + this.surname +
                "\nФакультет: " + this.faculty +
                "\nКурс: " + this.course +
                "\nГруппа: " + this.group +
                "\nСредняя оценка: " + this.averageRating;
        return information;
    }

    /*3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)*/
    public void changeGroup(String group) {
        this.group = group;
    }

    /*4. Создать метод, который будет возвращать текущую группу студента.*/
    public String currentGroup() {
        String currentGroup = this.group;
        return currentGroup;
    }

    /*5. Создать метод, который будет изменять оценку студента и группу*/
    void changeGroup(String group, int averageRating) {
        this.group = group;
        this.averageRating = averageRating;
    }

    /*7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
    массив студентов у которых оценка выше переданной оценке в методе.
    (Сигнатура метода будет выглядеть так Public Student[] getStudents(Students[] students, int mark)*/
    public Student[] getStudents(Student[] students, int mark) {
        Student[] getStudents = new Student[5];
        int i=0;
        for (Student s : students) {
            if (s.averageRating > mark) {
                getStudents[i] = s;
                i++;
            }
        }
        return getStudents;
    }

}
