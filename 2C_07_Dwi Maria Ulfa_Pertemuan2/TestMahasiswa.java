/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TestMahasiswa {
     public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nim = 101;
        mhs.nama = "Lestari";
        mhs.alamat = "Jl. Vinolia No 1A";
        mhs.kelas = "1A";
        mhs.tampilBiodata();
        
        System.out.println("==============================");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Aldi Syifa Askar";
        mhs.nim = 150;
        mhs2.kelas = "1E";
        mhs2.alamat = "Songgokerto";
        mhs2.tampilBiodata();
        
        System.out.println("==============================");
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs2.nim = 131;
        mhs2.nama = "Muhammad Wira Arkaan";
        mhs2.kelas = "1C";
        mhs2.alamat = "Lowokwaru";
        mhs2.tampilBiodata();
        
                
    }
}
