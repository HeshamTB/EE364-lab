public class Fraction {

    private int numerator;
    private int denominator;

    /**
     * Contruct a fraction numerator and denominator
     * <p>The fraction is reduced to it's minimum from if possible</p>
     * @param numerator Numerator
     * @param denominator Denominator
     */
    public Fraction(int numerator, int denominator){

        this.numerator = numerator;
        this.denominator = denominator;

        //reduce here

    }

    /**
     * Default value of fraction is 1 (1/1)
     */
    public Fraction(){

        this.numerator = 1;
        this.denominator = 1;

    }

    /**
     * Reduces a fraction to it's minimum form
     * @param oldFraction The fraction to be reduced.
     * @return reduced fraction
     */
    private Fraction reduce(Fraction oldFraction) {

        int gcd = GCD(oldFraction.numerator, oldFraction.denominator);
        return new Fraction(oldFraction.numerator/gcd, oldFraction.denominator/gcd);

    }

    /**
     * Find the greatest common divisor of two numbers.
     * @param a First value
     * @param b Second value
     * @return Greatest common divisor as Integer.
     */
    private int GCD(int a, int b){

        int gcd = 1;
        for (int i = 1; i <= b && i <= a; i++){
            if (b % i == 0 && a % i == 0) gcd = i; // i divides a and b
        }
        return gcd;
    }

    /**
     * Check if the fraction provided is equal in value
     * @param fraction The fraction to check
     * @return True if the fractions are equal, otherwise false.
     */
    public boolean equal(Fraction fraction){

        Fraction reducedFraction = reduce(fraction);
        if (this.numerator == reducedFraction.numerator &&
                this.denominator == reducedFraction.denominator) return true;
        return false;

    }

    /**
     * add two fractions
     * @param fraction1
     * @param fraction2
     * @return added fractions reduced to min form
     */
    public static Fraction add(Fraction fraction1, Fraction fraction2){

        return null;

    }

    /**
     * Multiply two fractions and reduce
     * @param fraction1
     * @param fraction2
     * @return
     */
    public static Fraction multiply(Fraction fraction1, Fraction fraction2) {

        //The constructor already reduces.
        return new Fraction(fraction1.numerator * fraction2.numerator,
                fraction1.denominator * fraction2.denominator);

    }

    /**
     * string of the fraction in num/den form
     * @return fraction string
     */
    public String toString(){

        return String.format("%d/%d", this.numerator, this.denominator);

    }

    /**
     * returns a string with the decimal value of the fraction
     * @param digits precision
     * @return decimal string
     */
    public String decimal(int digits){

        double decimal = this.numerator / this.denominator;
        return String.format("%."+digits, decimal);

    }

}
