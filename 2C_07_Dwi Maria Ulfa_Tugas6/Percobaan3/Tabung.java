/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author LENOVO
 */
public class Tabung extends Bangun{
    protected int t;
    public void setSuperPhi (double phi){
        super.phi = phi;
    }
    public void setSuperR(int r){
        super.r = r;
    }
    public void setT(int t){
        this.t = t;
    }
    
    public void volume(){
        System.out.println("Volume tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }

    void setSuperPhi(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
