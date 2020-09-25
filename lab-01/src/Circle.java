public class Circle extends _Point {

    private double radius;

    /**
     * construct a circle of radius r at origin
     * @param radius
     */
    public Circle(double radius){
        this(radius, 0, 0);
    }

    /**
     * construct a circle of radius r at (x,y)
     * @param radius
     * @param x
     * @param y
     */
    public Circle(double radius, int x, int y){
        super(x, y);
        setRadius(radius);
    }

    /**
     * set radius
     * @param radius
     */
    public void setRadius(double radius) {
        //default to unit circle if bad radius is given.
        //Maybe take abs(r) to negate negative radius.
        if (radius < 0) { this.radius = 1; }
        else this.radius = radius;
    }

    /**
     * get radius
     * @return radius
     */
    public double getRadius(){ return this.radius; }

    /**
     * get area
     * @return area
     */
    public double getArea() { return (Math.PI*Math.pow(radius, 2)); }

    /**
     * get circumference
     * @return circumference
     */
    public double getCircumference() { return 2*Math.PI*this.radius; }

    public String toString() {
        String format = "%sCircle's radius = %.2f ,area = %.2f, circumference = %.2f\n";
        return String.format(format, super.toString(), getRadius(), getArea(), getCircumference());
    }

}
