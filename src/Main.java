public class Main {
    public static void main(String[] args) {


        Jardin j = new Jardin(8,5,0,3);
        j.init();
        j.showLayout();
        Plant p = new Rose(PlantType.R,50,"red");
        Plant p2 = new Rose(PlantType.R,50,"red");
        Rose r1 = new Rose(PlantType.C,25,"yellow");
        Vegtable v1 = new Vegtable(PlantType.T,40);
        Vegtable v2 = new Vegtable(PlantType.L,20);
        j.installPlant(v1,7,0);
        j.installPlant(v2,0,0);
        j.installPlant(p,5,0);
        j.installPlant(p,6,5);
        j.installPlant(r1,0,4);
        System.out.println("--------after install");
        j.showLayout();

        j.verifyAllGarden();
    }
}



//horizon2021 -- pc password

