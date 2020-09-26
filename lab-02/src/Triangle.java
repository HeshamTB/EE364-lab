public class Triangle extends _Shape {

    private double base;
    private double height;

    public Triangle(double base, double height){
        super("Triangle");
        setBase(base);
        setHeight(height);
    }

    public void setBase(double base){
        if (base != 0) this.base = base;
        else this.base = 1;
    }

    public void setHeight(double height){
        if (height != 0) this.height = height;
        else this.height = 1;
    }

    public double getBase() { return this.base; }

    public double getHeight() {return this.height; }

    public double getArea() { return (this.base*this.height)/2; }

    public String toString() {
        return String.format("%s%.2f\n", super.toString(), this.getArea());
    }
}
