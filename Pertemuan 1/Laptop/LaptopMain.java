/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class LaptopMain {
     public static void main(String[] args) {
        Laptop lp = new Laptop();
        
        lp.setFeature("Lenovo", "Legion 5", "Black", 16.00f , "intel core i5",512 );
        lp.bukaAplikasi("Foxit Reader");
        lp.info();
        
        lp.setFeature("Asus", "TUF Gaming F17", "Black", 8.00f, "intel core i5", 512);
        lp.bukaAplikasi("Valorant");
        lp.info();
    }
}
