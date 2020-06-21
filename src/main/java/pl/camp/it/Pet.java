package pl.camp.it;

public class Pet {
    private int age;
    private String name;

    public Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
