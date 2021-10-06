/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author LENOVO
 */
public class Lingkaran {
    private float jejari;
    private double luas, keliling;

    public void setJejari(float r) {
        if (r > 0) {
            this.jejari = r;
        } else {
            this.jejari = 0;
        }
    }

    public double getLuas() {
        this.luas = 3.14 * (2 * this.jejari);
        return this.luas;
    }

    public double getKeliling() {
        this.keliling = 2 * 3.14 * this.jejari;
        return this.keliling;
    }
}
