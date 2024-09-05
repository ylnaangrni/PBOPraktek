import java.util.Scanner;

public class soal2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int i = 0;
        String word [] = new String[3];
        int number [] = new int[3];

        for(i = 0; i < 3; i++){
            String kata = sc.next();
            int angka = sc.nextInt();
            word[i] = kata;
            number [i] = angka;
        }
        for(i = 0; i < 3; i++){
            System.out.println("-------------------------");
            System.out.printf("%-15s%03d%n", word[i], number[i]);
            System.out.println("-------------------------");
        }
        sc.close();
    }
}
