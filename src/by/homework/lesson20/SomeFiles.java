package by.homework.lesson20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class SomeFiles implements Callable<List<String>> {

    @Override
    public List<String> call() throws Exception {
        List<String> namesFiles = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String name = "file" + i + "_" + hashCode() + ".txt";
            File newFile = new File("src/by/homework/lesson20/folder/", name);
            System.out.println(Thread.currentThread().getName() + " . . . " + name);

            try (FileWriter flw = new FileWriter(newFile);) {
                for (int j = 0; j < 10; j++) {
                    String txt = j + 1
                            + ". Имя файла: " + name
                            + " с каким-то hashCode: " + hashCode()
                            + " randomUUID: " + UUID.randomUUID()
                            + "\n";
                    flw.write(txt);
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("ERROR");
            }
            namesFiles.add(newFile.getName());
        }

        long randomMillis = ThreadLocalRandom.current().nextLong(1000, 3001);
        System.out.println("Поток " + Thread.currentThread().getName() + " пауза = " + randomMillis);
        Thread.sleep(randomMillis);

        return namesFiles;
    }
}
