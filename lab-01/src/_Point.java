public class _Point {

    private int x;
    private int y;

    public _Point(int x, int y){

        this.x = x;
        this.y = y;

    }

    public _Point(){

        this.x = 0;
        this.y = 0;

    }

    public void setLocation(int x, int y){

        this.x = x;
        this.y = y;

    }

    public int getX(){ return x; }

    public int getY(){ return y; }

    public void setX(int x){ this.x = x; }

    public void setY(int y){ this.y = y; }

    public String toString(){ return String.format("Current (x,y) location (%d,%d)\n", this.x, this.y); }

}
