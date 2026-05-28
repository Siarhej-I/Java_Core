package by.homework.lesson9;

public class Lion extends Animal {
    /*1.8 * Добавить класс Лев. Лев наследуется от животного.
    Переопределите в нем методы, которые есть в классе Животное (издание звуков, животное играет), с указанием,
    что это все делает лев (пример Лев играет).*/
    private String name;
    private String role;
    private int yearsOld;

    public Lion() {
    }

    public Lion(int id, String color, int yearsLife, String typeFood, String name, String role, int yearsOld) {
        super(id, color, yearsLife, typeFood);
        this.name = name;
        this.role = role;
        this.yearsOld = yearsOld;
    }

    @Override
    public void makeSounds() {
        System.out.println("Лев " + this.name + " рычит");
    }

    @Override
    public void animalPlay() {
        System.out.println("Этот лев " + this.name + " " + this.role + " спит");
    }

    public String toString() {
        String info = super.toString();
        info = info + "\nЧеловеческое имя: " + name + "\nРоль в прайде: " + role + "\nЛет от роду: " + yearsOld;
        return info;
    }
}
