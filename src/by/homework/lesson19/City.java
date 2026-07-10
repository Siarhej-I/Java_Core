package by.homework.lesson19;

public class City {
    /*Создать класс Город. Поля id, имя города, население, континент (Enum)*/
    private Integer id;
    private String name;
    private Integer count;
    private Continent continent;

    public City(Integer id, String name, Integer count, Continent continent) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Город: id=" + id + ", name=" + name + ", count=" + count + ", continent=" + continent + "\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
