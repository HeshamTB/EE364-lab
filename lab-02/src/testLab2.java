
public class testLab2 {
    public static void main(String args[]){
        _Shape[] shapes = new _Shape[3];
        shapes[0] = new Circle(2.2);
        shapes[1] = new Triangle(4.9, 7.43);
        shapes[2] = new _Rectangle(4.5);


        for (_Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        Circle c1 = new Circle(3.9);
        ((_Area)c1).getArea();
        //_Shape s = new _Rectangle(4.1);
        //_Area area = new _Area();
        _Area[] areas = new _Area[2];
        areas[0] = new _Rectangle(6.5);
        areas[1] = new Circle(5.5);

        _Shape shape2 = new Triangle(4.1, 7.3);
        shape2.getName();
        shape2.getArea();
        //shape2.base;

        _Shape r2 = new _Rectangle(8.94);
        if (r2 instanceof _Rectangle) ((_Rectangle) r2).setHeight(5);
    }
}
