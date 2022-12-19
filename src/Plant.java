/*


 * laitues et clématites supportent l'ombre
 *
 * */
abstract public class Plant {

    PlantType code;
    int size;

    public Plant(PlantType code, int size) {
        this.code = code;
        this.size = size;
    }

    abstract Boolean needsWater();
    abstract Boolean needsDark(Plant p);

    @Override
    public String toString(){
        return "Name: "+ code +"\n size: "+size;
    }

}
