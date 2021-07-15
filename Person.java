package Object.examples;

class Person {
    String name;
    int age;
    boolean marriageStatus;

    @Override
    public String toString() {
        String fullInfo = String.format("My name is %s. I’m %d years old. Am I married? %b ", getName(), getAge(), getMarriageStatus());
        return fullInfo;
    }

    @Override
    public boolean equals(Object p) {
        if (this.name == name && this.age == age && this.marriageStatus == marriageStatus) return true;
        if (this.name != name || this.age != age || this.marriageStatus != marriageStatus) return true;
        Person person = (Person) (p);
        return this.name == name;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public Person() {
        this.setName("Ivan");
        this.setAge(30);
        this.setMarriageStatus(false);
    }


    public Person(String name) {
        this.name = name;
        this.age = 18;
        this.marriageStatus = false;
    }

    public Person(String name, boolean marriageStatus) {
        this.setName(name);
        this.setMarriageStatus(marriageStatus);
        this.age = 25;
    }

    public Person(String name, int age, boolean marriageStatus) {
        this.setName(name);
        this.setAge(age);
        this.setMarriageStatus(marriageStatus);
    }


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

    public void setMarriageStatus(boolean marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public boolean getMarriageStatus() {
        return marriageStatus;
    }


    // метод Юбилеи
    public int anniversary(int getAge) {
        int quantityAnniversary = getAge() / 10;
        System.out.println("Количество юбилеев " + quantityAnniversary);
        return quantityAnniversary;
    }

    // метод с первой буквой имени
    public char firstLetterName(String getName) {
        char firstLetter = getName.charAt(0);
        System.out.println("Мое имя " + getName() + ". Первая буква в моем имени - "+ firstLetter);
        return firstLetter;
    }



    public static void main (String [] arg){

        Person person1= new Person();
        System.out.println(person1.toString());

        Person person2 = new Person("Katerina");
        System.out.println(person2.toString());

        Person person3=new Person("Anatoliy", true);
        System.out.println(person3.toString());

        Person person4 = new Person("Makar", 30, true);
        System.out.println(person4.toString());

        Person person5=new Person("Rita",45,true);
        System.out.println(person5.toString());

        //6) изменить значение поля Возраст
        person5.setAge(29);

        //7) Возраст, имя и семейный статус person1 можно вывести так и по остальным person так же
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.marriageStatus);


        //8) Создание массива
        Person [] person= {person1,person2,person3,person4,person5};
        for (int i=0; i< person.length;i++) {
            //option 1
            System.out.println(person[i].getName() +" "+ person[i].getAge() + " "+ person[i].getMarriageStatus());
            //option 2
            System.out.println(person[i].toString()); }


        person1.anniversary(person1.getAge());
        person2.anniversary(person2.getAge());

        person3.firstLetterName(person3.getName());
        person4.firstLetterName(person4.getName());

    }
}

