public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction() {
    }

    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public Fraction summaFraction (Fraction obj){
        Fraction newFraction = new Fraction();
        newFraction.numerator = this.numerator * obj.denumerator + obj.numerator * this.denumerator;
        newFraction.denumerator = this.denumerator * obj.denumerator;
        for (int i = newFraction.denumerator; i > 0; i--){
            if (newFraction.numerator % i == 0 && newFraction.denumerator % i == 0){
                newFraction.numerator = newFraction.numerator / i;
                newFraction.denumerator = newFraction.denumerator / i;
            }
        }
        return newFraction;
    }

    public Fraction minusFraction (Fraction obj){
        Fraction newFraction = new Fraction();
        newFraction.numerator = this.numerator * obj.denumerator - obj.numerator * this.denumerator;
        newFraction.denumerator = this.denumerator * obj.denumerator;
        for (int i = newFraction.denumerator; i > 0; i--){
            if (newFraction.numerator % i == 0 && newFraction.denumerator % i == 0){
                newFraction.numerator = newFraction.numerator / i;
                newFraction.denumerator = newFraction.denumerator / i;
            }
        }
        return newFraction;
    }


    @Override
    public String toString() {
        return  numerator + "/" + denumerator;
    }
}
