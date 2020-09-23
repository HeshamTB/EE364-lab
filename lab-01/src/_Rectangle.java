public class _Rectangle extends _Point {

    private double height;
    private double width;

    /**
     * Construct Rectangle with location (0,0)
     * @param width width of rectangle
     * @param height height of rectangle
     */
    public _Rectangle(double width, double height){
        super();// This might be useless.
        this.height = height;
        this.width = width;
    }

    /**
     * Construct a rectangle
     * @param x x coordinate
     * @param y y coordinate
     * @param w width of rectangle
     * @param h height of rectangle
     */
    public _Rectangle(int x, int y, double w, double h){
        super(x, y);
        this.width = w;
        this.height = h;
    }

    /**
     * set height of rectangle
     * @param h height
     */
    public void setHeight(double h){ this.height = h; }

    /**
     * set width of rectangle
     * @param w width
     */
    public void setWidth(double w){ this.width = w; }

    /**
     * returns height
     * @return height
     */
    public double getHeight(){ return this.height; }

    /**
     * returns width
     * @return width
     */
    public double getWidth(){ return this.width; }

    /**
     * returns area
     * @return area
     */
    public double getArea(){ return this.height*this.width; }

    /**
     * returns circumference
     * @return circumference
     */
    public double getCircumference(){ return 2*(this.width+this.height); }

    public String toString() {
        return String.format("%sRectangle's Height %.2f, Width %.2f, Area %.2f, Circumference %.2f",
                super.toString(), getHeight(), getWidth(), getArea(), getCircumference());
    }
}
