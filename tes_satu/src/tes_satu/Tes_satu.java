/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tes_satu;
import kendaraan.*;
/**
 *
 * @author ad
 */
public class Tes_satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mobil m = new mobil ();
        m.jenis = "sport";
        m.jumlahroda = 4;
        System.out.println("mobil " + m.jenis + "berjalan sambil terbang");
        System.out.println("mobil beroda " + m.jumlahroda);
        m.berjalan();
        m.berlapis();
        
        System.out.println("\n");
        motor mtr = new motor ();
        mtr.jenis = "bebek";
        mtr.jumlahroda = 3;
        System.out.println("motor ini berjenis " + mtr.jenis + "bekas donald trump");
        System.out.println("beroda " + mtr.jumlahroda);
        
    }
    
}

