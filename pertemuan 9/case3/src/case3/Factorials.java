// ****************************************************************
// Factorials.java
// Membaca bilangan bulat dari pengguna dan mencetak faktorial masing-masing.
//
// ****************************************************************
package case3;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();

            try {
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Menangani pengecualian
            }

            System.out.print("Another factorial? (y/n): ");
            keepGoing = scan.next();
        }
    }
}







