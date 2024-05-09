package forSerialization;
import java.io.Serial;
import java.io.Serializable;

public class Dog extends Animal implements Serializable {


    @Serial
    private static final long serialVersionUID = -5823506718725952620L;

    public Dog(String name, int age) {
        super(name, age);
    }
}
