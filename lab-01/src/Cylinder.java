public class Cylinder extends Circle {

    private double height;

    public Cylinder(double r, double h){
        super(r);//Recommended by IDE. Invokes Circle(double radius).
        // Circle with location 0, 0 and radius r.
        this.height = h;
        //now a cylinder with radius r and height h at 0,0
    }

    public Cylinder(int x, int y,double r, double h){
        super(r, x, y); //a circle with radius r at x,y
        this.height = h;
        //cylinder with radius r and height h at x,y
    }

    public double getSurfaceArea(){
        return 2*(Math.PI*getRadius()*getHeight() + Math.PI*Math.pow(getRadius(),2));
    }

    public double getVolume(){
        return Math.PI*Math.pow(getRadius(), 2)*getHeight();
    }

    public void setHeight(double h){ this.height = h;}

    public double getHeight(){ return this.height; }

    public String toString(){
        String format = "%sCylinder's height = %.2f ,Surface area = %.2f , Volume = %.2f";
        return String.format(format, super.toString(), getHeight(), getSurfaceArea(), getVolume());
    }

}
