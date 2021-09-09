/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Sepedaa {
     String brand;
    String warna;
    String genre;
    int gear;
    
    public void setFeature(String brand, String warna, String genre){
        this.brand = brand;
        this.warna = warna;
        this.genre = genre;
    }
    
    public void setGear(int gear){
        this.gear = gear;
    }
    
    public int incGear(int gear){
        this.gear += gear;
        return this.gear;
    }
    
    public int decGear(int gear){
        this.gear -= gear;
        return this.gear;
    }
    
    public void info(){
        System.out.println("====================Sepeda====================");
        System.out.println("Brand\t\t : " + this.brand);
        System.out.println("Warna\t\t : " + this.warna);
        System.out.println("Genre\t\t : " + this.genre);
        System.out.println("Gear Sekarang\t : " + this.gear);
        System.out.println("==============================================");
        System.out.println();
    }
}
