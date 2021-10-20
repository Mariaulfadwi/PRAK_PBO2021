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
public class Dosen extends Manusia{
    private int Makan;
    private double Lembur;
    
    public int getMakan(){
        return Makan;
    }
    
    public void setMakan(int Makan){
        this.Makan = Makan;
    }
    
    public double getLembur(){
        return Lembur;
    }
    
    public void setLembur(){
        this.Lembur = Lembur;
    }
    
    public void setLembur(double Lembur){
        this.Lembur = Lembur;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getLembur(){
        return super.Lembur() + Makan * Lembur;
    }
    
    @Override
    public double getLembur(int Makan, double Lembur){
        return super.getLembur() + Makan * Lembur;
    }
    
    public void lihatInfo(){
        System.out.println("Tidur: " + this.getTidur());
        System.out.println("Makan: " + this.getMakan());
        System.out.println("Lembur: " + this.getLembur());
        System.out.println("jml lembar: " + this.getLembur());
        System.out.printf("lembur: %.0f\n", this.getLembur());
        System.out.printf("Makan : %.0f\n", this.getMakan());
    }

    private String getTidur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMakan(String nasi_Goreng) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTidur(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLembur(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Bernafas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
