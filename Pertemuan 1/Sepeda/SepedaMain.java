/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class SepedaMain {
    public static void main(String[] args) {
        Sepedaa spd = new Sepedaa();
        
        spd.setFeature("Polygon", "Green", "City and Touring");
        spd.setGear(3);
        spd.incGear(2);
        spd.info();
        
        spd.decGear(4);
        spd.info();
    }
}
