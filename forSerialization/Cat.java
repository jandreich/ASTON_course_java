package forSerialization;

import java.io.Serial;
import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = -2914385999648051554L;


    public Cat(String name, int age) {
        super(name, age);
    }

   
}
