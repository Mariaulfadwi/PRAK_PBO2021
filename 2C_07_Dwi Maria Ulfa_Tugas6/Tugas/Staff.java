/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Staff {
    private int jumlah_kehadiran;
    private final int TARIF_HARIAN = 50000;
   
    public Staff(){
       
    }
   
    public Staff (String nip,String nama, String alamat){
        super(nip,nama,alamat);
    }
   
    public void setKehadiran(int jumlah_kehadiran){
        this.jumlah_kehadiran=jumlah_kehadiran;
    }
   
    public int getGaji(){
        int total_gaji=jumlah_kehadiran*TARIF_HARIAN;
        return total_gaji+super.getGaji();
    }

    void setNama(String bagus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
