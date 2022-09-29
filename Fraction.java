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

    public double doubleValue() {
        return (double)_numerateur / (double)_denominateur;
    }

    /* Réduit les valeurs du numérateur et du dénominateur au minimum,
    sans changer la valeur de la fraction */
    public void reduce() {
        int n = _numerateur >= 0 ? _numerateur : -_numerateur;
        int d = _denominateur >= 0 ? _denominateur : -_denominateur;
        int div = n > d ? pgcd(n, d) : pgcd(d, n);
        _numerateur /= div;
        _denominateur /= div;
    }

    /* pgcd de a et b, avec a >= b >= 0 */
    int pgcd(int a, int b) {
        assert a >= b : "Erreur pgcd : a < b";
        assert a >= 0 && b >= 0 : "Erreur pgcd : entier negatif";
        if((b < 2) || (a % b == 0))
            return b;
        return pgcd(b, a % b);
    }

    public String toString() {
        return  _numerateur + " / " + _denominateur;
    }
}