package exercise2;

public class Main {
    public static void main(String[] args) {
        Square kotak = new Square();
        System.out.println(kotak.toString());
        System.out.println("Luas=" + kotak.getArea());
        System.out.println("Keliling=" + kotak.getPerimeter());

        Square kotak1 = new Square(50.0);
        System.out.println(kotak1.toString());
        System.out.println("Luas1=" + kotak1.getArea());
        System.out.println("Keliling1=" + kotak1.getPerimeter());

        Square kotak2 = new Square("pink", true, 60.00);
        System.out.println(kotak2.toString());
        System.out.println("Luas2=" + kotak2.getArea());
        System.out.println("Keliling2=" + kotak2.getPerimeter());
    }
}



