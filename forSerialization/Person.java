package forSerialization;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 6383717424617001000L;
    private String name;
    private int age;
    private List<Animal> animals;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Animal animal) {
        animals = new ArrayList<>();
        this.name = name;
        this.age = age;
        animals.add(animal);
    }

    public Person(String name, int age, List<Animal> animals) {
        this.name = name;
        this.age = age;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void setAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", " + ((animals != null) ? "animals= "+ animals : "no animals") +
                '}';
    }
}
