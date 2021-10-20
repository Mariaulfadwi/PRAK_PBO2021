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
public class SegiTiga {
    public SegiTiga (double panjang) {

        System.out.println("\nVariabel = segitiganya sama sisi”);
        System.out.println("Panjang = ” +panjang);
        keliling(panjang);
    }

public SegiTiga (double panjang, double sisiMiring) {

        System.out.println("\n2Variabel = segitiganya sama kaki”);
        System.out.println("Panjang = ” +panjang+ ” sisi miring =”  +sisiMiring);
        keliling(panjang,sisiMiring);

    }

public void keliling(double panjang) {
        tampilkanHasil (panjang*3);

    }

public void keliling(double p, double sM) {

        tampilkanHasil (2*sM+p);
    }

protected void tampilkanHasil (double h) {

        System.out.println("Hasil = ” +h);
    }
}
