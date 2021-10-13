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
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
   
    public Pegawai(){
       
    }
   
    public Pegawai(String nama,String nip, String alamat)
    {
        this.nama=nama;
        this.nip=nip;
        this.alamat=alamat;
    }
   
    public void setNama(String nama){
        this.nama=nama;
    }
   
    public String getNama(){
        return this.nama;
    }
   
    public int getGaji(){
        return 1500000;
    }
}
