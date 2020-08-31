public class Circle extends _Point {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
        this.setLocation(0, 0);
    }

    public Circle(double radius, int x, int y){
        this.radius = radius;
        this.setLocation(x, y);
    }

    public void setRadius(double radius) { this.radius = radius; }

    public double getRadius(){ return this.radius; }

    public double getArea() { return (Math.PI*Math.pow(radius, 2)); }

    public double getCircumfrence() { return 2*Math.PI*this.radius; }

    public String toString() {
        String format = "%sCircle's radius = %f ,area = %f, circumfrence = %f\n";
        return String.format(format, super.toString(), getRadius(), getArea(), getCircumfrence());
    }

}
