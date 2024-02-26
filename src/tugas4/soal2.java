/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class soal2 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Batas Awal : ");
        int n = scanner.nextInt();   
        
        System.out.println("Masukkan Batas Akhir : ");
        int j = scanner.nextInt();    
    
        
        for(int i=n; i<=j; i++){
           if(i%2 == 0)
            System.out.println(""+i);
        }
    }
    
}
