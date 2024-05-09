package forSerialization;

import java.io.Serial;
import java.io.Serializable;

public abstract class Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = -7240172904091792333L;
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
