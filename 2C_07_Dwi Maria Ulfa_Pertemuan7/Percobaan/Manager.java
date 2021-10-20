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
public class Manager extends karyawan {
    private double tunjangan;
    private String bagian;
    private Staf st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }  

    public void setStaff(Staf[] st) {
        this.st = st;
    }
    
    public void viewStaff(){
        int i;
        System.out.println("--------------");
        for(i=0;i<st.length;i++){
            st[i].lihatInfo();
        }
        System.out.println("--------------");
    }
    
    public void lihatInfo(){
        System.out.println("Manager : "+this.getBagian());
        System.out.println("NIP : "+super.getNip());
        System.out.println("Nama : "+super.getNama());
        System.out.println("Golongan : "+super.getGolongan());
        System.out.println("Tunjangan : "+this.tunjangan());
        System.out.println("Bagian : "+this.getBagian());
//        System.out.println("Gaji Lembur : %0.0f\n "+this.getGajiLembur());
        System.out.printf("Gaji : %.0f\n"+this.getGaji())
    }

    @Override
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }

    private String tunjangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Staf {

        public Staf() {
        }

        private void lihatInfo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
