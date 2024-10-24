// ****************************************************************
// CountLetters.java
//
// Membaca sebuah kata dari input standar dan mencetak jumlah
// kemunculan setiap huruf dalam kata tersebut.
//
// ****************************************************************
import java.util.Scanner;
public class CountLetters{
    public static void main(String[] args){
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        // mendapatkan kata dari pengguna
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        // mengubah semua huruf menjadi huruf besar
        word = word.toUpperCase();
        // menghitung frekuensi setiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try 
            {
                counts[word.charAt(i) - 'A']++; // Mencari indeks huruf
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("Not a letter: " + word.charAt(i)); // Pesan jika bukan huruf
            }
        }
        //Mencetak frekuensi
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}



