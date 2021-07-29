package NewYear;

public class Sweet {

        String name;
        double weight;
        String manufactor;
        static int count=0;

    Sweet (String name, double weight, String manufactor){
            this.name=name;
            this.weight=weight;
            this.manufactor=manufactor;
            count++;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", manufactor='" + manufactor + '\'' +
                '}';
    }

    public int countArrayLength() {
        Sweet[] array = new Sweet[count];
        return array.length;
        }
}

