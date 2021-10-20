/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    public static void main(String[] args){
        System.out.println("program testing class Dosen & Manusia");
        Dosen man[]=new Dosen[2];
        Manusia Manusia1[]=new Manusia[2];
        Manusia Manusia2[]=new Manusia[2];

        //pembuatan Dosen
        
        man[0]=new Dosen();
        man[0].setMakan("Nasi Goreng");
        man[0].setTidur("101");
        man[0].setLembur("1");
        man[0].Bernafas(5000000);
        man[0].setLembur("Administrasi");
        
        man[1]=new Dosen();
        man[1].setMakan("Nasi Goreng");
        man[1].setTidur("101");
        man[1].setLembur("1");
        man[1].Bernafas(5000000);
        man[1].setLembur("Administrasi");
        
        Manusia1[0]=new Manusia();
        Manusia1[0].setMakan("sate");
        Manusia1[0].setTidur("0003");
        Manusia1[0].setLembur("2");
        Manusia1[0].setBernafas(10);
        Manusia1[0].setBernafas(10000);
        
        Manusia1[1]=new Manusia();
        Manusia1[1].setMakan("Bakso");
        Manusia1[1].setTidur("0005");
        Manusia1[1].setLembur("2");
        Manusia1[1].setBernafas(10);
        Manusia1[1].setMakan(55000);
        orang1 man[0].(orang1);
        
        Manusia2[0]=new Manusia();
        Manusia2[0].setMakan("mie ");
        Manusia2[0].setTidur("0004");
        Manusia2[0].setLembur("3");
        Manusia2[0].setBernafas(15);
        Manusia2[0].setBernafas(55000);
        
        Manusia2[1]=new Manusia();
        Manusia2[1].setMakan("arie");
        Manusia2[1].setTidur("0006");
        Manusia2[1].setLembur("4");
        Manusia2[1].setBernafas(5);
        Manusia2[1].setMakan(100000);
        
        Manusia2[2]=new Manusia();
        Manusia2[2].setMakan("ayam");
        Manusia2[2].setTidur("0007");
        Manusia2[2].setLembur("3");
        Manusia2[2].setBernafas(6);
        Manusia2[2].setMakan(20000);
        man[1].setManusia(Manusia2);
        
         //cetak informasi dari manager + staffnya
        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}
