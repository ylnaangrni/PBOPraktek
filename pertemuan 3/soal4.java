import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        double gajipokok = 500000;
        double bonus = 0;
        double hargaitem = 50000;
    
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah jual: ");
        int jumlahjual = sc.nextInt();
    
        if (jumlahjual >= 40) {
            if (jumlahjual > 80) {
                bonus = 0.35 * jumlahjual * hargaitem;
            } 
            else {
                bonus = 0.25 * jumlahjual * hargaitem;
            }
            gajipokok += bonus;
        } else if (jumlahjual < 15) {
            gajipokok = gajipokok - (0.15 * (15 - jumlahjual) * hargaitem);
        } else {
            bonus = 0.1 * jumlahjual * hargaitem;
            gajipokok += bonus;
        }
    
        int gajifinal = (int) gajipokok;
    
        System.out.println("Gaji akhir: " + gajifinal);
    
        sc.close();
    }

}
