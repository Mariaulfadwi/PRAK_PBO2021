/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;
    
    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama,jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Keledai makan kedelai");
    }
    public void displayBinatang(){
        System.out.println("imoett");

    }
    public void displayData(){
        displayMakan();
        displayBinatang();
        System.out.println("suara: "+suara);
        System.out.println("warna Bulu: "+warnaBulu);

    }

}
