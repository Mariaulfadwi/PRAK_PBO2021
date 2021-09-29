/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author LENOVO
 */
public class MainPertanyaan {
    public static void main(String[] args){
        Pegawai masinis = new Pegawai ("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya baru", "Bisnis", masinis);
        
        System.out.println(KeretaApi.info());
    }
}
