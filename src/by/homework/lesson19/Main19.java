package by.homework.lesson19;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main19 {
    public static void main(String[] args) {

        System.out.println("-------------TASK 1------------------");
        InString inStr = (str) -> str.toUpperCase();
        String resultStr = inStr.getString("какой-то текст в нижнем регистре");
        System.out.println(resultStr);

        System.out.println("\n-------------TASK 2------------------");

        /*1.1. Создать города*/
        City city1 = new City(1, "Mexico", 9209944, Continent.NORTH_AMERICA);
        City city12 = new City(12, "Chicago", 2746388, Continent.NORTH_AMERICA);
        City city2 = new City(2, "Santiago", 5279190, Continent.SOUTH_AMERICA);
        City city3 = new City(3, "Byenos-Aires", 14017736, Continent.SOUTH_AMERICA);
        City city4 = new City(4, "Johannesburg", 4434827, Continent.AFRICA);
        City city5 = new City(5, "Rabat", 585000, Continent.AFRICA);
        City city6 = new City(6, "Zalcburg", 158400, Continent.EUROPE);
        City city7 = new City(7, "Kopengagen", 671000, Continent.EUROPE);
        City city8 = new City(8, "Damask", 2503000, Continent.ASIA);
        City city9 = new City(9, "Hanoi", 9400000, Continent.ASIA);
        City city10 = new City(10, "Melburn", 5159211, Continent.AUSTRALIA);
        City city13 = new City(13, "Adelaida", 1402000, Continent.AUSTRALIA);
        City city11 = new City(11, "Mak-Merdo", 1200, Continent.ANTARCTICA);
        City city14 = new City(14, "Esperansa", 90, Continent.ANTARCTICA);

        List<City> cityList = List.of(city1, city2, city3, city4, city5, city6, city7, city8, city9, city10, city11,city12,city13,city14);

        /*1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)*/
        System.out.println("\n------------самый густонаселённый город на континенте------------");
        System.out.print("На континенте " + Continent.NORTH_AMERICA + " "
                + maxPeopleInContinent(cityList, Continent.NORTH_AMERICA).stream().toList());
        System.out.print("На континенте " + Continent.SOUTH_AMERICA + " "
                + maxPeopleInContinent(cityList, Continent.SOUTH_AMERICA).stream().toList());
        System.out.print("На континенте " + Continent.AFRICA + " "
                + maxPeopleInContinent(cityList, Continent.AFRICA).stream().toList());
        System.out.print("На континенте " + Continent.EUROPE + " "
                + maxPeopleInContinent(cityList, Continent.EUROPE).stream().toList());
        System.out.print("На континенте " + Continent.ASIA + " "
                + maxPeopleInContinent(cityList, Continent.ASIA).stream().toList());
        System.out.print("На континенте " + Continent.AUSTRALIA + " "
                + maxPeopleInContinent(cityList, Continent.AUSTRALIA).stream().toList());
        System.out.print("На континенте " + Continent.ANTARCTICA + " "
                + maxPeopleInContinent(cityList, Continent.ANTARCTICA).stream().toList());

        /*1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)*/
        System.out.println("\n------------город с минимальным населением на континенте------------");
        System.out.print("На континенте " + Continent.NORTH_AMERICA + " "
                + minPeopleInContinent(cityList, Continent.NORTH_AMERICA).stream().toList());
        System.out.print("На континенте " + Continent.SOUTH_AMERICA + " "
                + minPeopleInContinent(cityList, Continent.SOUTH_AMERICA).stream().toList());
        System.out.print("На континенте " + Continent.AFRICA + " "
                + minPeopleInContinent(cityList, Continent.AFRICA).stream().toList());
        System.out.print("На континенте " + Continent.EUROPE + " "
                + minPeopleInContinent(cityList, Continent.EUROPE).stream().toList());
        System.out.print("На континенте " + Continent.ASIA + " "
                + minPeopleInContinent(cityList, Continent.ASIA).stream().toList());
        System.out.print("На континенте " + Continent.AUSTRALIA + " "
                + minPeopleInContinent(cityList, Continent.AUSTRALIA).stream().toList());
        System.out.print("На континенте " + Continent.ANTARCTICA + " "
                + minPeopleInContinent(cityList, Continent.ANTARCTICA).stream().toList());

        /*1.4. Найти самый густонаселённый город (max)*/
        Optional<City> maxPeopleCity = cityList.stream().max(Comparator.comparing((cityMaxCount)->cityMaxCount.getCount()));
        System.out.println("\nСамый густонаселённый город " + maxPeopleCity.get().getName()
                + " с населением " + maxPeopleCity.get().getCount()
                + " человек");

        /*1.5. Найти город с самым маленьким населением. (min)*/
        Optional<City> minPeopleCity = cityList.stream().min(Comparator.comparing((cityMinCount)->cityMinCount.getCount()));
        System.out.println("\nСамый малонаселенный город " + minPeopleCity.get().getName()
                + " с населением " + minPeopleCity.get().getCount()
                + " человек");

        /*1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).*/
        Optional<City> someCity = cityList.stream().filter((sCity)->sCity.getCount()>1000000).findFirst();
        System.out.println("\nПервый попавшийся город, с населением больше 1 млн человек - "+someCity.get().getName());

        /*1.7. Отобрать города с населением больше 1 млн. (filter)*/
        Stream<City> moreMillion = cityList.stream().filter((mMillion)->mMillion.getCount()>1000000);
        System.out.println("\nГорода с населением больше 1 млн:\n "+moreMillion.toList());

        /*1.8. Создать коллекцию из названий городов, на основании объектов (map)*/
        Collection<String> nameCity = cityList.stream().map((cName)->cName.getName()).toList();
        System.out.println("Список названий городов:\n"+nameCity);

    }

    public static Optional<City> maxPeopleInContinent(List<City> city, Continent continent) {
        Optional<City> maxPeople = city.stream().filter((cityCont) ->
                (cityCont.getContinent().equals(continent))
        ).max(Comparator.comparing((City cityCount) -> cityCount.getCount()));
        if (maxPeople.isEmpty()) {
            throw new RuntimeException("Город на континенте не найден!\n");
        }
        return maxPeople;
    }

    public static Optional<City> minPeopleInContinent(List<City> city, Continent continent) {
        Optional<City> minPeople = city.stream().filter((cityCont) ->
                (cityCont.getContinent().equals(continent))
        ).min(Comparator.comparing((City cityCount) -> cityCount.getCount()));
        if (minPeople.isEmpty()) {
            throw new RuntimeException("Город на континенте не найден!\n");
        }
        return minPeople;
    }
}
