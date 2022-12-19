public class Vegtable extends Plant {

    /**
     * Vegtables needs water
     * L type needs dark
     * */
    public Vegtable(PlantType code, int size) {
        super(code, size);
    }

    @Override
    Boolean needsWater() {
        return true;
    }

    @Override
    Boolean needsDark(Plant p) {
        boolean r= (p.code.equals("L")) ? true : false;
        return r;
    }

}
