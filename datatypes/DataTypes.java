/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");

        long angka = sc.nextLong();

        try {
            System.out.println(angka + " can be fitted in:");
            if (angka >= Byte.MIN_VALUE & angka <= Byte.MAX_VALUE) {
                System.out.println("* Byte");
            }
            if (angka >= Short.MIN_VALUE & angka <= Short.MAX_VALUE) {
                System.out.println("* Short");
            }
            if (angka >= Integer.MIN_VALUE & angka <= Integer.MAX_VALUE) {
                System.out.println("* Integer");
            }
            if (angka >= Long.MIN_VALUE & angka <= Long.MAX_VALUE) {
                System.out.println("* Long");
            }
        } catch (Exception e) {
            System.out.println(angka + " can't be fitted anywhere");
        }
        // TODO code application logic here
    }
}
