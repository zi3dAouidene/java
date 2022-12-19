public class GardenZ {

    int size;
    Object map [][];
    int pipePosition;
    int shadowRow;
    int shadowCol;

    public GardenZ(int size, int pipePosition, int shadowRow, int shadowCol) {
        this.size = size;
        this.map = new Object[size][size];
        this.pipePosition = pipePosition;
        this.shadowRow = shadowRow;
        this.shadowCol = shadowCol;
    }


}
