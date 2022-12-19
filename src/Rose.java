
public class Rose extends Plant {

    /**
     * C type needs dark
     * */
    String color;

    public Rose(PlantType code, int size, String color) {
        super(code, size);
        this.color = color;
    }

    @Override
    Boolean needsWater() {
        return false;
    }

    @Override
    Boolean needsDark(Plant p) {
        boolean r= (p.code.equals("C")) ? true : false;
        return r;
    }

    @Override
    public String toString() {
        super.toString();
        return "\n Color: "+ color;
    }
}
