package NewYear;

public class Lollipop extends Sweet {

    private boolean gumInside=true;
    private boolean hardCandy=true;

    public Lollipop (String getName, double getWeight, String getManufactor, boolean hardCandy, boolean gumInside ){
        super(getName, getWeight, getManufactor);
        this.hardCandy=hardCandy;
        this.gumInside=gumInside;
    }


    public boolean getGumInside() {
        return gumInside;
    }

    public void setGumInside(boolean gumInside) {
        this.gumInside = gumInside;
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
        return "Lollipop {" +
                "name='" + name + '\'' +
                ", weight =" + weight +
                ", manufactor ='" + manufactor + '\'' +
                ", isHardCandy ='" + hardCandy + '\'' +
                ", isGumInside ='" + gumInside + '\'' +
                '}';
    }
}
