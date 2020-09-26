public class _Rectangle extends _Shape {

    private double width;
    private double height;

    public _Rectangle(double w){
        //Since only width or height is given, assume square.
        setWidth(w);
        setHeight(w);
    }

    public _Rectangle(double w, double h){
        setWidth(w);
        setHeight(h);
    }

    public double getArea(){
        return this.height*this.width;
    }

    public void setWidth(double w){
        if (w != 0) this.width = w;
        else this.width = 1;
    }

    public void setHeight(double h){
        if (h != 0) this.height = h;
        else this.height = 1;
    }

    public double getWidth(){ return this.width; }
    public double getHeight(){ return this.height; }

    public String toString() {
        return " ";//TODO: _Rectangle toString output format
    }
}
