package Collection;

public class Cat extends Pet{

    boolean liveAtHome;

    public Cat(String name, int age, String territory, boolean liveAtHome) {
        super(name, age, territory);
        this.liveAtHome=liveAtHome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLiveAtHome() {
        return liveAtHome;
    }

    public void setLiveAtHome(boolean liveAtHome) {
        this.liveAtHome = liveAtHome;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", liveAtHome=" + liveAtHome +
                '}';
    }
}
