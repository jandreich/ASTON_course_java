public class Person {

    private int age;
    private char sex;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        }
        else System.out.println("too young");
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == 'm' || sex == 'w') {
                this.sex = sex;
        } else System.out.println("wrong sex");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
                this.name = name;
        else System.out.println("wrong name");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getClass().getClassLoader());
        System.out.println(person.getClass().getSimpleName());
    }
}
