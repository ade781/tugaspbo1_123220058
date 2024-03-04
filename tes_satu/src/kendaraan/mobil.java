/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author ad
 */
public class mobil extends Kendaraan implements perang {

    public mobil() {
        System.out.println("ini adalah mobil satu");
    }
    public void berjalan(){ //polymorphin
        System.out.println(" berjalan dengan kecepatan cahaya");
    } 
    public void buatan(){
        System.out.println("buatan china");
    }
    public void membawa(){
        System.out.println("membawa meriam");
    }
    public void berlapis(){
        System.out.println("berlapis emas");
    }
}


