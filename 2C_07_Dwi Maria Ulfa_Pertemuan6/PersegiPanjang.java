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
public class PersegiPanjang {
    private float panjang, lebar;
    private double luas, keliling;

    public void setPanjang(float p) {
        if (p > 0) {
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }

    public void setLebar(float l) {
        if (l > 0) {
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }

    public double getLuas() {
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }

    public double getKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
        return this.keliling;
    }
}
