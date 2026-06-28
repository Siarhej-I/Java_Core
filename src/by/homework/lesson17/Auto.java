package by.homework.lesson17;

import java.io.Serializable;
import java.util.Objects;

public class Auto implements Serializable {
    /*2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
    Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи). */

    String brand;
    Integer maxSpeed;
    String countryFrom;

    public Auto(String brand, Integer maxSpeed, String countryFrom) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.countryFrom = countryFrom;
    }

    @Override
    public String toString() {
        return "|Авто: Марка - " + brand + ", max скорость - " + maxSpeed + ", произведена в - " + countryFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Auto auto)) return false;
        return Objects.equals(brand, auto.brand) && Objects.equals(countryFrom, auto.countryFrom);
    }

    @Override
    public int hashCode() {
        return brand.length() + maxSpeed + countryFrom.hashCode();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public void setCountryFrom(String countryFrom) {
        this.countryFrom = countryFrom;
    }
}
