public class Start {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1,3);
        Fraction fraction1 = new Fraction(2,5);
        Fraction fraction2 = new Fraction(7,8);
        Fraction fraction3 = new Fraction(5,1);
        Fraction fraction4 = Fraction.sum(fraction,fraction1);
        Fraction fraction5 = Fraction.sum(fraction2,fraction4);
        Fraction fraction6 = Fraction.min(fraction5,fraction3);

        System.out.println(fraction6);
    }
}