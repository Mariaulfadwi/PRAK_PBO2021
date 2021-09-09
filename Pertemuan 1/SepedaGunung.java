/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class SepedaGunung extends Sepeda{
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String tipeSuspensi){
        this.tipeSuspensi = tipeSuspensi;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Suspensi : " + this.tipeSuspensi);
    }
}
