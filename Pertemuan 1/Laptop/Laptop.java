/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Laptop {
    String merk;
    String brand;
    String color;
    float RAM;
    String processor;
    int storage;
    String application;
    
    public void setFeature(String brand,String merk, String color, float RAM, String processor, int storage){
        this.brand = brand;
        this.merk = merk;
        this.color = color;
        this.RAM = RAM;
        this.processor = processor;
        this.storage = storage;
    }
    
    public void bukaAplikasi(String application){
        this.application = application;
    }
    
    public void info(){
        System.out.println("====================Laptop====================");
        System.out.println("Merk \t\t\t : " + this.merk);
        System.out.println("Color \t\t\t : " + this.color);
        System.out.println("RAM \t\t\t : " + this.RAM + " GB");
        System.out.println("Processor \t\t : " + this.processor);
        System.out.println("Storage \t\t : " + this.storage + " GB");
        System.out.println("Opened Application \t : " + this.application);
        System.out.println("==============================================");
        System.out.println();
    }
}
