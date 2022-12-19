public class Tile {
    private int x;
    private int y;
    private boolean isShadow;
    private boolean isPipe;
    private String typePlant;

    public Tile(int x, int y, boolean isShadow, boolean isPipe, String typePlant) {
        this.x = x;
        this.y = y;
        this.isShadow = isShadow;
        this.isPipe = isPipe;
        this.typePlant = typePlant;
    }

    public Tile() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isShadow() {
        return isShadow;
    }

    public void setShadow(boolean shadow) {
        isShadow = shadow;
    }

    public boolean isPipe() {
        return isPipe;
    }

    public void setPipe(boolean pipe) {
        isPipe = pipe;
    }

    public String getTypePlant() {
        return typePlant;
    }

    public void setTypePlant(String typePlant) {
        this.typePlant = typePlant;
    }

    @Override
    public String toString() {
        return "[" + x +
                "," + y +
                "],S=" + isShadow +
                ",P=" + isPipe;
    }
}
