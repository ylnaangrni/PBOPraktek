/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

import static datatypes.ConvertDataType.methodOne;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Strings {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        int lenght = a.length() + b.length();
        
        System.out.println("Panjang string : " + lenght);
        
        int result = a.compareToIgnoreCase(b);
        
        if (result < 0){
            System.out.println("Yes");
        }else if (result > 0){
            System.out.println("No");
        }
        
        String satu = a.substring(0,1).toUpperCase();
        String dua = b.substring(0,1).toUpperCase();
        
        satu += a.substring(1);
        dua += b.substring(1);
    
        System.out.println(satu + " " + dua);
    }
    
}
