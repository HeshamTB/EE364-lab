import java.io.PrintStream;

public class FractionTest {
    public static void main(String args[]){

        PrintStream out = System.out;
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        out.println(f1.toString());
        out.println(f2.toString());
        out.println(f1.decimal(2));
        out.println(f2.decimal(2));
        out.println(f1.toString()+" "+f2.toString()+" are equal? "+ f1.equal(f2));
        out.println("multiple: "+ Fraction.multiply(f1, f2));
        out.println("add: "+ Fraction.add(f1, f2));
        out.println("subtract: "+ Fraction.subtract(f1, f2));
        out.println("divide: "+ Fraction.divide(f1, f2));

        out.println("------------------------------------");
        Fraction f3 = new Fraction(6,7);
        Fraction f4 = new Fraction(1,5);
        out.println(f3.toString());
        out.println(f4.toString());
        out.println(f3.decimal(2));
        out.println(f4.decimal(2));
        out.println(f3.toString()+" "+f4.toString()+" are equal? "+ f3.equal(f4));
        out.println("multiple: "+ Fraction.multiply(f3, f4));
        out.println("add: "+ Fraction.add(f3, f4));
        out.println("subtract: "+ Fraction.subtract(f3, f4));
        out.println("divide: "+ Fraction.divide(f3, f4));

    }
}
