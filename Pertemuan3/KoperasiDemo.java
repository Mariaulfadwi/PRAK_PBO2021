/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author LENOVO
 */
public class KoperasiDemo {
    public static void main(String[] args){
        Anggota anggota1 - new Anggota();
        anggota1.setNama("iwan Setiawan");
        anggota1.setAlamat("jalan sukarno hatta no 10");
        anggota1.setor(100000);
        System.out.println("simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
    }
}
