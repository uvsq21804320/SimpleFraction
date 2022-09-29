class Fraction {
    public int _numerateur;
    public int _denominateur;

    public static final Fraction UN = new Fraction(1);
    public static final Fraction ZERO = new Fraction();

    public Fraction(int numerateur, int denominateur) {
        _numerateur = numerateur;
        _denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        _numerateur = numerateur;
        _denominateur = 1;
    }

    public Fraction() {
        _numerateur = 0;
        _denominateur = 1;
    }

    public int getDenominateur() {
        return _denominateur;
    }

    public int getNumerateur() {
        return _numerateur;
    }

    public String toString() {
        return  _numerateur + " / " + _denominateur;
    }
}