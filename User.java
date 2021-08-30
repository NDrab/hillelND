import java.util.*;

public class User {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main (String []args){

         User user1 = new User("Vasiliy",50);
        User user2 = new User("Anton",30);
        User user3 = new User("Alla", 28);
        User user4 = new User("Peter",40);

        Map<String, Integer> userList = new HashMap<String, Integer>();
        userList.put (user1.name, user1.age);
        userList.put (user2.name, user2.age);
        userList.put (user3.name, user3.age);
        userList.put (user4.name, user4.age);

        Set<Map.Entry<String, Integer>> entries = userList.entrySet();
        System.out.println("All users: " + entries);

        Optional<String> optionalIsbn = userList.entrySet().stream()
                .filter(e ->e.getKey().startsWith("A"))
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println("First user in the list with the name starts with A is " +optionalIsbn.get());
    }
}
