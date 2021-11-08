/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main (String[] args){
        Gorilla g = new Gorilla("Ted",4,"Groooa groooa", "Hitam");
        g.displayData();
        g.displayMakan();
        g.displayBinatang();
        System.out.println();
        Singa s = new Singa("Ted",4,"raww raww", "coklat");
        s.displayData();
        s.displayMakan();
        s.displayBinatang();
        System.out.println();
        Keledai k = new Keledai("Ted",4,"xixixi xixixi", "Hitam");
        k.displayData();
        k.displayMakan();
        k.displayBinatang();
        System.out.println();
        
    }
}
