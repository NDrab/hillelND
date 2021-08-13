package Collection;

public class Pet {
    String name;
    int age;
    String territory;

    public Pet(String name, int age, String territory) {
        this.name = name;
        this.age = age;
        this.territory = territory;
    }

    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTerritory() {
        return territory; }

    public void setTerritory(String territory) {
        this.territory = territory; }


}
