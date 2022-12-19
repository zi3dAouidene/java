public class Garden {

    private int size;
    private Tile[][] matrix = new Tile[size][size];
    private int PipePostion;
    private int shadowFrom;
    private int shadowTo;

    public Garden(int size, int PipePosition, int shadowFrom, int shadowTo) {
        this.size = size;
        this.PipePostion=PipePosition;
        this.shadowTo=shadowTo;
        this.shadowFrom=shadowFrom;
        Tile[][] table=new Tile[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               Tile aux=new Tile(i,j,(shadowFrom<j&&shadowTo>j),i==PipePosition-1,"");
        table[i][j]=aux;
                }
            }

        this.matrix=table;
        }
public void showMatrix(){
    for (int i = 0; i < size; i++) {
        System.out.println("|");
        for (int j = 0; j < size; j++) {
        System.out.print("|"+this.matrix[i][j].toString());
    }}
    }}
