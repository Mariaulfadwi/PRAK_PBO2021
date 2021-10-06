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
public class Segitiga {
    private float alas, tinggi;
    private double luas, keliling;

    public void setAlas(float a) {
        if (a > 0) {
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }

    public void setTinggi(float t) {
        if (t > 0) {
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }

    public double getLuas() {
        this.luas = this.alas * this.tinggi * 0.5;
        return this.luas;
    }

    public double getKeliling() {
        this.keliling = this.alas + this.tinggi + this.tinggi;
        return this.keliling;
    }
}
