public class Jardin {

    private Object [][] gardenArea;
    private int size;
    private int pipePosition;
    private int shadowFrom;
    private int shadowTo;

    public Jardin(int n, int pipe_position, int shadow_from, int shadow_to) {
        this.size = n;
        this.pipePosition = pipe_position;
        this.shadowFrom = shadow_from;
        this.shadowTo = shadow_to;
        this.gardenArea = new Object[n][n];
    }

    public void init(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j == pipePosition){
                    gardenArea[i][j] = "*";
                }else if (i >= shadowFrom && i <= shadowTo){
                    gardenArea[i][j] = "#";
                }else {
                    gardenArea[i][j] = "0";
                }
            }
        }
    }
    public void installPlant(Plant p, int i, int j){
        if (gardenArea[i][j] == "*"){
            System.out.println("Can NOT plant in a pipe place ["+i +","+j+"] !!!!!!");
        } else if ((( j > 0 && gardenArea[i][j-1]=="*") || (j< size -2 && gardenArea[i][j+1]=="*")) && (p.code != PlantType.L || p.code != PlantType.T)) {
            System.out.println("Can NOT plant it here, too much water ["+i +","+j+"] !!!!!!");
        } else if (gardenArea[i][j] == "#" && p.needsDark(p))  {
            System.out.println("Can NOT plant it in dark area ["+i +","+j+"] !!!!!!");
        }else {
            gardenArea[i][j] = p;
        }
    }

    public void showLayout(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j== size -1){
                    if (gardenArea[i][j] instanceof Plant){
                        System.out.println(((Plant) gardenArea[i][j]).code);
                    }else {
                    System.out.println(gardenArea[i][j]);
                    }
                }else {
                    if (gardenArea[i][j] instanceof Plant){
                        System.out.print(((Plant) gardenArea[i][j]).code);
                    }else {
                        System.out.print(gardenArea[i][j]);
                    }
                }
            }
        }
    }

    // verify garden
    public void verifyAllGarden(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               if (gardenArea[i][j] == "#" || gardenArea[i][j] == "0"){
                   System.out.println("all good");
                   return;
               }
            }
        }
        System.out.println("all goo keep it up");
    }
}
