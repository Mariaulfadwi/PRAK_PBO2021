/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Sepeda {
    private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerek(String merek){
        this.merek = merek;
    }
    
    public void gantiGear(int gear){
        this.gear = gear;
    }
    
    public void tambahKecepatan(int kecepatan){
        this.kecepatan = this.kecepatan + kecepatan;
    }
    
    public void rem(int kecepatan){
        this.kecepatan = this.kecepatan - kecepatan;
    }
    
    public void cetakStatus(){
        System.out.println("Merek : " + this.merek);
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("Gear : " + this.gear);
    }
}
