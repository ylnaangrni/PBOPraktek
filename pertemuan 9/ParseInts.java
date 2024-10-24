// ****************************************************************
// ParseInts.java
//
// Membaca satu baris teks dan mencetak angka-angka yang ada di dalam baris tersebut.
//
// ****************************************************************
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0; // Variabel untuk menyimpan nilai dan jumlah
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Loop untuk memproses setiap token
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next()); //Mengurai bilangan bulat dari token
                sum += val;
            } catch (NumberFormatException e) {
                System.out.println("Not a number, skipped." + e.getMessage());
            }
        }

        System.out.println("The sum of the integers on this line is: " + sum);
    }
}





