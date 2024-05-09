package forSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class doSerialize {

    public static void main(String[] args) {
        Person [] people = new Person[] {
        new Person("John", 27, new Cat("Murka", 3)),
        new Person("Max", 31, Arrays.asList(new Dog("Chak", 2), new Cat("Tom", 6))),
        new Person("Barby", 21)};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\O\\java\\ASTON\\src\\forSerialization\\serial.bin"))){

        oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
