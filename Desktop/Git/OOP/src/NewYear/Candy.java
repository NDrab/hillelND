package NewYear;

public class Candy extends Sweet {
    private boolean hardCandy=true;

    public Candy (String getName, double getWeight, String getManufactor, boolean hardCandy ){
        super(getName, getWeight, getManufactor);
        this.hardCandy=hardCandy;
    }

    public boolean getHardCandy() {
        return hardCandy;
    }

    public void setHardCandy(boolean hardCandy) {
        this.hardCandy = hardCandy;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getManufactor() {
        return super.getManufactor();
    }

    @Override
    public void setManufactor(String manufactor) {
        super.setManufactor(manufactor);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", weight =" + weight +
                ", manufactor ='" + manufactor + '\'' +
                ", isHardCandy ='" + hardCandy + '\'' +
                '}';
    }
}
