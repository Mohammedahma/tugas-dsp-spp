/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mohemmad;

import java.util.Scanner;

/**
 *
 * @author mohmm
 */
public class MOHEMMAD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jalur, gol;
        System.out.println("Masukkan pilihan jalur \n SBMPTN \n SNMPTN \n MANDIRI ");
        jalur = in.next();
        if (jalur.equalsIgnoreCase("SBMPTN")) {
            System.out.println("Pilih golongan pendaftaran \n A \n B \n C");
            gol = in.next();
            if (gol.equalsIgnoreCase("A")) {
                System.out.println("DSP = 5 juta");
                System.out.println("SPP = 500 ribu");
            } else if (gol.equalsIgnoreCase("B")) {
                System.out.println("DSP = 15 juta ");
                System.out.println("SPP = 1 juta");
            } else if (gol.equalsIgnoreCase("C")) {
                
            }
        }
    }
}
