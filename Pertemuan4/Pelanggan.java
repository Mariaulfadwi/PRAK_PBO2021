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
public class Pelanggan {
    
    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) +
        sopir.hitungBiayaSopir(hari);
    }
}
