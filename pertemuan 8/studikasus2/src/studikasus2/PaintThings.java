package studikasus2;

public class PaintThings {  
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck      : " + deckAmt);
        System.out.println("Big Ball  : " + ballAmt);
        System.out.println("Tank      : " + tankAmt);
    }
}