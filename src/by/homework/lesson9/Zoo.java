package by.homework.lesson9;

public class Zoo {

    /*1.3 Создать класс Зоопарк в котором будут жить наши животные. В качестве поля в новом классе будет массив из животных (private Animal[]animals).*/
    private Animal[] animals = new Animal[0];

    /*1.4 Реализовать метод в классе зоопарк по добавлению нового животного. Сигнатура метода будет такая: public void addAnimal(Animal animal);
    Данный метод должен будет скопировать текущий массив с животными в новый массив с животными.
    Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное.
    Полученный массив нужно перезаписать в поле animals в классе Зоопарк.*/
    public void addAnimal(Animal animal) {
        Animal[] newAnimal = new Animal[animals.length + 1];
        int i = 0;
        for (Animal a : this.animals) {
            newAnimal[i] = a;
            i++;
        }
        newAnimal[newAnimal.length - 1] = animal;
        this.animals = newAnimal;
    }

    /*1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.*/
    public Animal[] getAnimals() {
        for (Animal a : animals) {
            if (a != null) {
                System.out.println("Животное [" + (a.getId()) + "]: " + a.getClass().getSimpleName() + "@" + a.hashCode());
            }
        }
        return animals;
    }

    /*Реализуйте метод, который будет выводить все информацию о каждом животном в зоопарке.*/
    public Animal[] infoAnimals() {
        for (Animal a : animals) {
            if (a != null) {
                System.out.println("Животное [" + (a.getId()) + "]: " + a + "\n");
            }
        }
        return animals;
    }

    /*Реализовать метод по удалению животного из зоопарка по номеру (id).
    Вывести информацию о все у животных в зоопарке.*/
    public void removeAnimal(int id) {
        Animal[] removeArray = new Animal[animals.length - 1];
        int i = 0, minId = 1000, maxId = -1000;
        for (Animal a : animals) {
            if (a.getId() < minId) {
                minId = a.getId();
            }
            if (a.getId() > maxId) {
                maxId = a.getId();
            }
        }
        for (Animal a : animals) {
            if (id > maxId || id < minId) {
                System.out.println("Введенный id за пределами id массива!");
                break;
            } else if (a.getId() != id) {
                removeArray[i] = a;
                i++;
            }
        }
        this.animals = removeArray;
    }
}
