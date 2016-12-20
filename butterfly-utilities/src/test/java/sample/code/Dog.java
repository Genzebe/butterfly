package sample.code;

import java.time.LocalDate;

/**
 * This is a sample code for test purposes.
 * In this case, this is just a POJO representing dogs.
 *
 * @author facarvalho
 */
public class Dog {

    public String name;
    public String breed;
    public String color;

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public Dog setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public Dog setColor(String color) {
        this.color = color;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

}
