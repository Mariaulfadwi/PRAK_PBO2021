/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class MesinCuci {
    String merk;
    int capasity;
    int energy;
    int clothesWash;
    int clothesDry;
    
    public void setFeature(String merk,int capacity,int energy){
        this.merk = merk;
        this.capasity = capacity;
        this.energy = energy;
    }
    
    public int cuciBaju(int clothesWeight){
        this.clothesWash = clothesWeight;
        return clothesWeight;
    }
    
    public int keringBaju(int clothesWeight ){
        this.clothesDry = clothesWeight;
        return clothesWeight;
    }
    
    public void info(){
        System.out.println("====================Mesin Cuci====================");
        System.out.println("Merk\t\t\t : " + this.merk);
        System.out.println("Capacity\t\t : " + this.capasity + " kg");
        System.out.println("Energy Consumption \t : " + this.energy + " W");
        System.out.println("Clothes laundry \t : " + this.clothesWash + " kg");
        System.out.println("Dried clothes \t\t : " + this.clothesDry + " kg");
        System.out.println("==================================================");
        System.out.println();
    }
}
