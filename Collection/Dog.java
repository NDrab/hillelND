package Collection;

public class Dog extends Pet{

    /*String name;
    int age;*/
    String breed;

    public Dog (String name, int age, String territory, String breed) {
        super(name, age, territory);
        this.breed=breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", territory='" + territory + '\'' +
                ", breed = " + breed +
                '}';
    }
}


