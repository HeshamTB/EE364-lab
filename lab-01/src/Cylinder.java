public class Cylinder extends Circle {

    private double height;

    /**
     * Construct a cylinder at origin with Radius r and height h
     * @param r radius
     * @param h height
     */
    public Cylinder(double r, double h){
        super(r);
        // Circle with location 0, 0 and radius r.
        this.height = h;
        //now a cylinder with radius r and height h at 0,0
    }

    /**
     * Construct a cylinder at (x,y) with Radius r and height h
     * @param x X
     * @param y Y
     * @param r radius
     * @param h height
     */
    public Cylinder(int x, int y,double r, double h){
        super(r, x, y); //a circle with radius r at x,y
        this.height = h;
        //cylinder with radius r and height h at x,y
    }

    /**
     * get surface area of cylinder
     * @return surface area
     */
    public double getSurfaceArea(){
        return 2*(Math.PI*getRadius()*getHeight() + Math.PI*Math.pow(getRadius(),2));
    }

    /**
     * get volume of cylinder
     * @return volume
     */
    public double getVolume(){
        return Math.PI*Math.pow(getRadius(), 2)*getHeight();
    }

    /**
     * set height h
     * @param h
     */
    public void setHeight(double h){ this.height = h;}

    /**
     * get height
     * @return height
     */
    public double getHeight(){ return this.height; }

    public String toString(){
        String format = "%sCylinder's height = %.2f ,Surface area = %.2f , Volume = %.2f";
        return String.format(format, super.toString(), getHeight(), getSurfaceArea(), getVolume());
    }

}
