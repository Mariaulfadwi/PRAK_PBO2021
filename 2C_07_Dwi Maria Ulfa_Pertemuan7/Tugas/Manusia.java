/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author LENOVO
 */
public class Manusia {
    private int Makan;
    private double Bernafas;
    
    public int getMakan(){
        return Makan;
    }
    
    public void setMakan(int Makan){
        this.Makan = Makan;
    }
    
    public double getBernafas(){
        return Bernafas;
    }
    
    public void setBernafas(double Bernafas){
        this.Bernafas = Bernafas;
    }
    
    public double getLembur(){
        return Makan * Bernafas + super.getLembur();
    }
    
    public double getLembur(int Makan, double Bernafas){
        return super.getLembur() + Makan * Bernafas;
    }

    double Lembur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMakan(String sate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTidur(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLembur(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
