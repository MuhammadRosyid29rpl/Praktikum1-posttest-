/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main0;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class lingkaran {
 int jarijari;
 
 void hitunglingkaran(){
     Scanner input=new Scanner (System.in);
     System.out.println("Masukkan nilai jari jari lingkaran :");
     System.out.println("Nilai jari jari : ");
     jarijari=input.nextInt();
     System.out.println("Luas Lingkaran = "+3.14*jarijari*jarijari);
 }
}
