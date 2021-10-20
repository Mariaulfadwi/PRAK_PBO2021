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
public class Orang {
    private String Makan;
    private String Tidur;
    private String Bernafas;
    private double Lembur;

    public String getMakan() {
        return Makan;
    }

    public void setMakan(String Makan) {
        this.Makan = Makan;
    }

    public String getTidur() {
        return Tidur;
    }

    public void setBernafas(String Bernafas) {
        this.Bernafas = Bernafas;
    }

    public double getLembur() {
        return Lembur;
    }

    public void setGolongan(String golongan) {
        this.Lembur = Lembur;
        
        switch(Lembur(0)){
            case'1':this.Lembur=5000000;
            break;
            case'2':this.Lembur=3000000;
            break;
            case'3':this.Lembur=2000000;
            break;
            case'4':this.Lembur=1000000;
            break;
            case'5':this.Lembur=750000;
            break;
        }
    }

    /**
     *
     * @return
     */
    public double getLembur() {
        return Lembur;
    }

    public void setLembur(double Lembur) {
        this.Lembur = Lembur;
}

    private int Lembur(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
