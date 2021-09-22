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
public class MotorDemo {
    public static void main(String[] args){
        Motor1 motor1 = new Motor1();
        motor1.printStatus();
        motor1.Kecepatan = 50;
        motor1.printStatus();
    }
}
