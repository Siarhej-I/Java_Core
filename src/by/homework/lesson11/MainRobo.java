package by.homework.lesson11;

public class MainRobo {
    public static void main(String[] args) {

        /*1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар)
        и вызовите метод отремантировать робота (результаты выполнения методы выведите в консоль)*/

        Robot roboCook = new RoboCook();
        Robot roboSapper = new RoboSapper();
        Robot roboBuilder = new RoboBuilder();

        roboSapper.repair();

        System.out.println("-------1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn. ----------");
        Robot roboCook1 = new RoboCook("Shef", 2000, "Belarus", "kastrulya", true);
        RoboEngineer roboSapper1 = new RoboSapper("First", 5000, "LandMine", "Metall", false);
        RoboEngineer roboBuilder1 = new RoboBuilder("Prorab", 1500, "Poland", "chertezh", "plastik", true);

        System.out.println(roboCook1.toString());
        roboCook1.turnOff();
        System.out.println(roboCook1.toString() + "\n");

        System.out.println(roboSapper1.toString());
        roboSapper1.turnOn();
        System.out.println(roboSapper1.toString() + "\n");

        System.out.println(roboBuilder1.toString());
        roboBuilder1.turnOff();
        System.out.println(roboBuilder1.toString() + "\n");

        System.out.println("-------1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)------");
        System.out.println(roboCook1.uniquePossibility());
        System.out.println(roboSapper.uniquePossibility());
        System.out.println(roboBuilder1.uniquePossibility());

        System.out.println("--------1.5 Добавить интерфейс, который будет называться РоботИнженер.---------");
        System.out.println(roboSapper1.createItem());
        System.out.println(roboBuilder1.createItem());

        System.out.println("--------1.6 Создать 3 выставки (массива) роботов в классе Main-----------");
        /*1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов
        (робот-повар, робот сапёр, робот строитель).
        Вторая выставка- только для инженерных роботов.
        Третья выставка- для роботов сапёров.
        Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
        Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров,
        вызвав метод createItem на каждом Роботе, который есть на выставке. */

        Robot[] allRobot = new Robot[3];
        allRobot[0] = roboCook1;
        allRobot[1] = roboSapper1;
        allRobot[2] = roboBuilder1;

        RoboEngineer[] onlyEngineer = new RoboEngineer[3];
        onlyEngineer[0] = roboSapper1;
        onlyEngineer[1] = roboBuilder1;
        onlyEngineer[2] = new RoboBuilder("Betonschik", 3000, "USA", "betonomeshalka", "ferum", true);

        RoboSapper[] onlySapper = new RoboSapper[3];
        onlySapper[0] = new RoboSapper("Boss", 7000, "AllMine", "Gold", true);
        onlySapper[1] = new RoboSapper("SkySapper", 2000, "SkyMine", "Silver", false);
        onlySapper[2] = new RoboSapper("LandSapper", 4000, "LandMine", "Silver", true);

        System.out.println("\n=============Выставка 'Все виды роботов'==============");
        for (Robot r : allRobot) {
            System.out.println("метод uniquePossibility: " + r.getModel() + " " + r.getClass().getSimpleName() + " " + r.uniquePossibility());
            System.out.println("метод createItem: " + r.getModel() + " " + r.getClass().getSimpleName() + " для Robot не определен");
        }
        System.out.println("\n=============Выставка 'Роботов инженеров'==============");
        for (RoboEngineer rE : onlyEngineer) {
            System.out.println("метод uniquePossibility: " + rE.getModel() + " " + rE.getClass().getSimpleName() + " " + rE.uniquePossibility());
            System.out.println("метод createItem: " + rE.getModel() + " " + rE.getClass().getSimpleName() + " " + rE.createItem());
        }
        System.out.println("\n=============Выставка 'Роботов сапёров'==============");
        for (RoboSapper rS : onlySapper) {
            System.out.println("метод uniquePossibility: " + rS.getModel() + " " + rS.getClass().getSimpleName() + " " + rS.uniquePossibility());
            System.out.println("метод createItem: " + rS.getModel() + " " + rS.getClass().getSimpleName() + " " + rS.createItem());
        }
    }
}
