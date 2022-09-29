public class Main {
    public static void main(String[] args) {
        Fraction frac = new Fraction(11, 18);
        assert frac.toString().equals("11 / 18") : "Erreur toString";
        assert frac.getNumerateur() == 11 : "Erreur getNumerateur";
        assert frac.getDenominateur() == 18 : "Erreur getDenominateur";

    }
}
