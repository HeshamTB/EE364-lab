public class _Point {

    private int x;
    private int y;

    /**
     * Construct a point with cartesian coordinates
     * @param x
     * @param y
     */
    public _Point(int x, int y){

        this.x = x;
        this.y = y;

    }

    /**
     * Construct origin point
     */
    public _Point(){

        this.x = 0;
        this.y = 0;

    }

    /**
     * Set location of point
     * @param x
     * @param y
     */
    public void setLocation(int x, int y){

        this.x = x;
        this.y = y;

    }

    /**
     * Get current X
     * @return X
     */
    public int getX(){ return x; }

    /**
     * Get current Y
     * @return Y
     */
    public int getY(){ return y; }

    /**
     * set X
     * @param x
     */
    public void setX(int x){ this.x = x; }

    /**
     * set Y
     * @param y
     */
    public void setY(int y){ this.y = y; }

    public String toString(){ return String.format("Current (x,y) location (%d,%d)\n", this.x, this.y); }

}
