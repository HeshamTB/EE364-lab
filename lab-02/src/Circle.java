public class Circle extends _Shape {

    private double radius;

    public Circle(double radius){
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius){
        if (radius >= 0) this.radius = radius;
        else this.radius = 1;
    }

    public double getRadius(){ return radius; }

    public double getArea() { return Math.PI*Math.pow(radius, 2); }

    public String toString(){
        return String.format("%s%.2f\n", super.toString(), this.getArea());
    }
}
