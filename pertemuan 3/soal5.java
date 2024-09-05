import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan input: ");
        String a = sc.nextLine();
    
        String plat = a.replaceAll("\\s", "");
    
        long addnumber = Long.parseLong(plat);
    
        int cekplat = (int) ((addnumber - 999999) % 5);
    
        if (cekplat != 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    
        sc.close();
    }
}
