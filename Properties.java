import java.io.Serializable;

public class Properties implements Serializable {
    private String age;
    private String salary;

    public Properties() { }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "properties{" +
                "age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
