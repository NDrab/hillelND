package NewYear;

public class Lollipop extends Candy {

    private boolean gumInside;

    public Lollipop (String getName, double getWeight, String getManufactor, boolean hardCandy, boolean gumInside ){
        super(getName, getWeight, getManufactor, hardCandy);
        this.gumInside=false;
    }

    public boolean getGumInside() {
        return gumInside;
    }

    public void setGumInside(boolean gumInside) {
        this.gumInside = gumInside;
    }

    @Override
    public boolean getHardCandy() {
        return super.getHardCandy();
    }

    @Override
    public void setHardCandy(boolean hardCandy) {
        super.setHardCandy(hardCandy);
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
        return super.toString() + "с жевательной резинкой " + getGumInside();
    }
}
