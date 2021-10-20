/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author LENOVO
 */
public class Perkalianku {
    void Perkalian(int a, int b){
        System.out.println(a * b);
    }
    
    void Perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }
    
    public static void main(String args []){
        Perkalianku objek = new Perkalianku();
        objek.Perkalian(25, 43);
        objek.Perkalian(34, 23, 56);
    }
}
