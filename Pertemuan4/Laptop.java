/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author LENOVO
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

}
