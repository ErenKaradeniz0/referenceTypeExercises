public class TestCoffe {
    public static void main(String[] args) {

        Coffe p1, p2, p3, p4;
        p1 = new Coffe(0.6, 100);
        p2 = p1;
        p3 = new Coffe(0.9, 150);
        p4 = p3;

        p1.calculate_price();
        p2.calculate_price();
        p3.calculate_price();
        p4.calculate_price();
        System.out.println();


        p4.weight = 1.5;
        p3.calculate_price();
        p4.calculate_price();

        System.out.println();
        p4 = new Coffe(2, 200);
        p3.calculate_price();
        p4.calculate_price();

        p1.weight=7;
        p1.calculate_price();
        p2.calculate_price();
    }
}
