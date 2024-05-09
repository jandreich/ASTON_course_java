package forSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class doDeserialize {

    public static void main(String[] args) {


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\O\\java\\ASTON\\src\\forSerialization\\serial.bin"))){

        Person[] people = (Person[]) ois.readObject();

        for (Person person : people) {
            System.out.println(person);
        }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }




    }

}
