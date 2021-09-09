/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class MotorMain {
     public static void main(String[] args) {
        Motor mt = new Motor();
        
        mt.setFeature("Honda", "Vario", 125, 20);
        mt.incSpeed(40);
        mt.info();
        mt.incSpeed(20);
        mt.info();
        mt.decSpeed(10);
        mt.info();
    }
}
