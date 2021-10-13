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
public class Dosen {
   private int jumlahSKS;
   private final int TARIF_SKS = 120000;
   
   public Dosen(){
       
   }
 
   public Dosen(String nip,String nama, String alamat){
       super(nip,nama,alamat);
   }
   
   public void setSKS(int SKS){
       this.jumlahSKS = SKS;
   }
   @Override
   public int getGaji(){
       int total_gaji=jumlahSKS*TARIF_SKS;
       return total_gaji+super.getGaji();
   }

    void setNama(String abdul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
