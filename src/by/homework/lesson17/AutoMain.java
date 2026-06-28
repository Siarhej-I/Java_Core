package by.homework.lesson17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Мерседес", 500, "GERMANY");
        Auto auto2 = new Auto("Лексус", 475, "SWEDEN");

        List<Auto> cars = new ArrayList<>();
        cars.add(auto1);
        cars.add(auto2);

        serialize(cars, "src/by/homework/lesson17/fileFolder/auto.txt");

        List<Auto> farmsOut = deserialize("src/by/homework/lesson17/fileFolder/auto.txt");
        System.out.println(farmsOut);

    }

    static String serialize(List<Auto> farm, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(farm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    static List<Auto> deserialize(String file) {
        List<Auto> car = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            car = (List<Auto>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }
}
