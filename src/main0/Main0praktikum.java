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
public class Main0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        int nomor;
        System.out.println("1.Menghitung Luas Lingkaran");
        System.out.println("2.Menghitung Luas Persegi");
        System.out.println("============================");
        System.out.println("Pilih nomor sesuai kebutuhan anda : ");
        nomor=input.nextInt();
        if (nomor==1){
            lingkaran panggil=new lingkaran();
            panggil.hitunglingkaran();}
        else {
            if (nomor==2) {
                persegi panggil=new persegi();
                panggil.hitung();
                
            }
        }
    }
}
    

