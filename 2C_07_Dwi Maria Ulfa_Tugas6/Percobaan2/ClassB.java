/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author LENOVO
 */
public class ClassB {
  public int z;
    
    public void setZ(int z){
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("nilai Z:"+ z );
    }
    public void getJumlah(){
        int x = 0;
        int y = 0;
        System.out.println("jumlah:"+ (x+y+z) );
    }    

    void setX(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setY(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNilai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNilaiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
