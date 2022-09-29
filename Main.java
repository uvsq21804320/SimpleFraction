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
        assert frac.compareTo(new Fraction(-3, 4)) == 0 : "Erreur compareTo (égal)";
        assert frac.compareTo(new Fraction(-15, 20)) == 0 : "Erreur compareTo (égal)";
        assert frac.compareTo(new Fraction(-1)) > 0 : "Erreur compareTo (inférieur)";
        assert frac.compareTo(new Fraction(1)) < 0 : "Erreur compareTo (supérieur)";
        System.out.println("Everything fine pal");
    }
}
