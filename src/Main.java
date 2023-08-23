public class Main {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.setName("fdjgkfjgs");
//        human.setNumberPhone("89308881122");
//        human.setBirthday(20,4,2011);
//        System.out.println(human);
//        System.out.println(human.cnt);


        Fraction fraction = new Fraction(1,2);
        Fraction fraction1 = new Fraction(1,6);
        Fraction fraction2 = new Fraction();
        fraction2 = fraction.summaFraction(fraction1);
        System.out.println(fraction2);
        fraction2 = fraction.minusFraction(fraction1);
        System.out.println(fraction2);

    }
}
