public class _Rectangle {

    private double width;
    private double height;

    public _Rectangle(double w){
        this.width = w;
    }

    public _Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public void setWidth(double w){
        this.width = w;
    }

    public void setHeight(double h){
        this.height = h;
    }

    public double getWidth(){ return this.width; }
    public double getHeight(){ return this.height; }

    public String toString() {
        return " ";//TODO: _Rectangle toString output format
    }
}
