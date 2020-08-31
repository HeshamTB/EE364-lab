public class _Rectangle extends _Point {

    private double height;
    private double width;

    public _Rectangle(double width, double height){
        this.height = height;
        this.width = width;
        this.setLocation(0, 0);
    }

    public _Rectangle(int x, int y, double w, double h){
        this.width = w;
        this.height = h;
        this.setLocation(x, y);
    }

    public void setHeight(double h){ this.height = h; }

    public void setWidth(double w){ this.width = w; }

    public double getHeight(){ return this.height; }

    public double getWidth(){ return this.width; }

    public double getArea(){ return this.height*this.width; }

    public double getCircumfrence(){ return 2*(this.width+this.height); }

    public String toString() {
        return String.format("%sRectangle's Height %.2f, Width %.2f, Area %.2f, Circumfrence %.2f",
                super.toString(), getHeight(), getWidth(), getArea(), getCircumfrence());
    }
}
