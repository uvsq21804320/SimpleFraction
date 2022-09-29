public class Main {
    public static void main(String[] args) {
        int num = -12, den = 16;
        Fraction frac = new Fraction(num, den);
        assert frac.toString().equals(num + " / " + den) : "Erreur toString";
        assert frac.getNumerateur() == num : "Erreur getNumerateur";
        assert frac.getDenominateur() == den : "Erreur getDenominateur";
        assert frac.doubleValue() == (double)num / den : "Erreur doubleValue";
        frac.reduce();
        assert frac.getNumerateur() == -3 : "Erreur reduce";
        assert frac.getDenominateur() == 4 : "Erreur reduce";
        assert frac.equals(new Fraction(-24, 32)) : "Erreur equals";
        assert frac.add(new Fraction(5, 8)).equals(new Fraction(-1, 8)) : "Erreur : add";
        System.out.println("Everything fine pal");
    }
}
