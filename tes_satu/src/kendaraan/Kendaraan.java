/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author ad
 */
public abstract class Kendaraan {
    public String jenis;
    public int jumlahroda;
    
    
    public Kendaraan(){
      System.out.println("ini kendaraan");
    }
    public abstract void berjalan();
    
    
}

