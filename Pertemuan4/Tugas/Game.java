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
public class Game {
     public Game(String kode, int jumlah){
         this.pemain= pemain;
         this.game = game;
         
     }
     
     public void setGame(String Game){
         this.game = game;
     }
     
     public void setPemain(pemain ){
         this.pema = pema;
     }
     
     public Pemain getGame(){
         return pema;
     }
     
     public String infp(){
         String info = "";
         info += "Game : " + Game+ "\n";
         info += "pemain : " + pemain + "\n";
     }
}
