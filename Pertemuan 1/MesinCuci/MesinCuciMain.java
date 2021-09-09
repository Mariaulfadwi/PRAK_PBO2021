/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class MesinCuciMain {
     public static void main(String[] args) {
        MesinCuci mc = new MesinCuci();
        
        mc.setFeature("Sharp", 9, 380);
        mc.cuciBaju(5);
        mc.keringBaju(5);
        mc.info();
        
        mc.setFeature("Aqua", 8, 380);
        mc.cuciBaju(7);
        mc.keringBaju(5);
        mc.info();
    }
}
