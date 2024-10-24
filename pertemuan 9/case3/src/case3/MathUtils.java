// ****************************************************************
// MathUtils.java
//
// Menyediakan fungsi utilitas matematika statis.
//
// ****************************************************************
package case3;

public class MathUtils {
    //-------------------------------------------------------------
    // Mengembalikan nilai faktorial dari argumen yang diberikan
    //-------------------------------------------------------------
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        } else if (n > 16) {
            throw new IllegalArgumentException("The number is too large (more than 16) to calculate the factorial.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}











