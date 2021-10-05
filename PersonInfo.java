import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.*;
import java.util.*;

public class PersonInfo implements Serializable {

    public static void main (String[] args) throws IOException {

        PersonInfo newPerson1 = new PersonInfo();

        Address newPerson1Address = new Address();
        newPerson1Address.setStreet("Polska");
        newPerson1Address.setCity("Odesa");
        newPerson1Address.setZipcode(65026);

        Properties newPerson1Properties = new Properties();
        newPerson1Properties.setSalary("2500 USD");
        newPerson1Properties.setAge("39 years");

        newPerson1.setId(100);
        newPerson1.setRole("manager");
        newPerson1.setPermanent(true);
        newPerson1.setName("Ivan");
        newPerson1.setProperties(newPerson1Properties);
        newPerson1.setAddress(newPerson1Address);

        ArrayList< Integer > phoneNumbers = new ArrayList<Integer>();
        phoneNumbers.add(5646546);
        phoneNumbers.add(6568897);
        newPerson1.setPhoneNumbers(phoneNumbers);

        ArrayList < String > cities = new ArrayList < String>();
        cities.add("Kyiv");
        cities.add("Kharkiv");
        newPerson1.setCities(cities);


      // записать данные в файл json
        Gson gson = new Gson();
        File file = new File("Example.json");
        FileWriter fileWriter = new FileWriter(file);
        gson.toJson(newPerson1,fileWriter);


        // считать данные из файла json
        Gson gson1 = new Gson();
        Reader reader = new FileReader("src/main/resources/example1.json");
        PersonInfo board = gson.fromJson(reader, PersonInfo.class);
        System.out.println(board);


        ObjectMapper objectMapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        objectMapper.writeValue(writer,newPerson1 );
        String result = writer.toString();
        System.out.println(result);
 }

    private int id;
    private String name;
    private boolean permanent;

    ArrayList< Integer > phoneNumbers = new ArrayList<Integer>();

    public ArrayList<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    Address address;

    private String role;

    ArrayList < String > cities = new ArrayList < String>();

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }


    Properties properties;

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getPermanent() {
        return permanent;
    }

    public Address getAddress() {
        return address;
    }

    public String getRole() {
        return role;
    }

    public Properties getProperties() {
        return properties;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", phoneNumbers=" + phoneNumbers +
                 address +
                ", role='" + role + '\'' +
                ", cities=" + cities
                 + properties +
                '}';
    }
}