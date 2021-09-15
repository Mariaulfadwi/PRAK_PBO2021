/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
public class Game {
     int id;
    String member;
    String game;
    int sewa;
    int harga;
    int hargaSewa;
    
    public void setGames(String member, String game, int harga, int sewa){
        this.member = member;
        this.game = game;
        this.harga = harga;
        this.sewa = sewa;
        id++;
    }
    
    public int hargaBayar(){
        hargaSewa = sewa * harga;
        return hargaSewa;
    }
    
    public void data(){
        System.out.println("===============Sistem Informasi Sewa Video Game==============");
        System.out.println("Id Member\t : " + this.id);
        System.out.println("Nama Member\t : " + this.member);
        System.out.println("Nama Game\t : " + this.game);
        System.out.println("Harga Sewa\t : " + this.harga + "/hari");
        System.out.println("Lama Sewa\t : " + this.sewa + " hari");
        System.out.println("Jumlah\t\t : 1");
        System.out.println("------------------------------------");
        System.out.println("Total Pembayaran : Rp" + this.hargaSewa);
        System.out.println("=============================================================");
        System.out.println();
        
    }
}
