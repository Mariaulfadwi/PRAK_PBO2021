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
public class Motor1 {
     private int kecepatan = 0;
     private boolean kontak0n = false;
    int Kecepatan;
     
     public void printStatus(){
         if (kontak0n == true){
             System.out.println("kontak 0n");
         }
         else{
             System.out.println("kontak 0ff");
         }
         System.out.println("kecepatan " + kecepatan+"\n");
     }
}
