/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Motor {
    String merk;
    String brand;
    int cc;
    int kecepatan;
    
    public void setFeature(String brand, String merk, int cc,int kecepatan){
        this.brand = brand;
        this.merk = merk;
        this.cc = cc;
        this.kecepatan = kecepatan;
    }
    
    public int incSpeed(int kecepatan){
        this.kecepatan = this.kecepatan + kecepatan;
        return this.kecepatan;
    }
    
    public int decSpeed(int kecepatan){
        this.kecepatan = this.kecepatan - kecepatan;
        return this.kecepatan;
    }
    
    public void info(){
        System.out.println("===================Motor====================");
        System.out.println("Brand\t\t : " + this.brand);
        System.out.println("Merk\t\t : " + this.merk);
        System.out.println("Kapasitas\t : " + this.cc + " cc");
        System.out.println("Kecepatan\t : " + this.kecepatan);
        System.out.println("============================================");
        System.out.println();
    }
}
