/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author LENOVO
 */
public class ClassB {
     public int z;
    int x;
    int y;
    
    public void setZ(int z){
        System.out.println("nilai z:"+ z );
    }
    public void getJumlah(int x){
        System.out.println("Jumlah:"+ (x+y+z) );

    }

    void getNilai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNilaiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getJumlah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
