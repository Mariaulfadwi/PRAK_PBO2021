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
public class MainPercobaan4 {
    Penumpang p = new Penumpang("12345", "Mr. Krab");
    Gerbong gerbong = new Gerbong("A", 10);
    gerbong.setPenumpang(p, 1);
    System.out.println(gerbong.info());
}
