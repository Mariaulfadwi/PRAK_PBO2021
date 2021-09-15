/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class GameMain {
     public static void main(String[] args) {
        Game gms = new Game();
        
        gms.setGames("Dwi Maria Ulfa", "Digimon Adventure", 35000, 2);
        gms.hargaBayar();
        gms.data();
        
        gms.setGames("Halda dini silma", "Mortal Kombat", 50000, 3);
        gms.hargaBayar();
        gms.data();
        
        gms.setGames("Karmila Novi", "E-Football 2021", 65000, 5);
        gms.hargaBayar();
        gms.data();
    }
}
