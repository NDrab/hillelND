package NewYear;

public class Sweet {

        String name;
        double weight;
        String manufactor;

        Sweet (String name, double weight, String manufactor){
            this.name=name;
            this.weight=weight;
            this.manufactor=manufactor;
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
}
