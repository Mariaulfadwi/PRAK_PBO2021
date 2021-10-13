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
public class Main {
     public static void main(String[] args){
        Staff s1=new Staff();
        s1.setNama("Bagus");
        s1.setKehadiran(10);
       
        Dosen d1 = new Dosen();
        d1.setNama("Abdul");
        d1.setSKS(20);
       
        Pegawai p1 = new Pegawai();
        p1.setNama("Sulton");
       
        DaftarGaji daftar_gaji=new DaftarGaji(3);
        daftar_gaji.addPegawai(s1);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }
}
