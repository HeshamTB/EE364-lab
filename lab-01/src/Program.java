import java.io.PrintStream;

public class Program {
    public static void main(String args[]){

        PrintStream out = System.out;

        Circle c0 = new Cylinder(4,9);
        out.println(c0);
        _Rectangle r = new _Rectangle(2,7);
        out.println("\n"+r);
        _Point p = new Cylinder(8,6);
        Circle c = (Cylinder)p;
        c.setLocation(4,-3);
        out.println("\n"+c);

    }
}
