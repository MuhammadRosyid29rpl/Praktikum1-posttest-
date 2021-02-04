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
public class persegi {
int panjangsisi;

void hitung(){
    Scanner input=new Scanner (System.in);
            System.out.println("Masukkan nilai panjang sisi persegi");
            System.out.println("Panjang Sisi: ");
            panjangsisi=input.nextInt();
            System.out.println("Luas Persegi = "+panjangsisi*panjangsisi);
}
}
