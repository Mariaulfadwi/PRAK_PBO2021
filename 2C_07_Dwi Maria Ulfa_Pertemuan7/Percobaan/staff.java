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
public class staff extends karyawan {
    private int lembur;
    private double gajiLembur;

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    //overriding
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;//menggunakan atrinbut
    }

    //overloading
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.println("jml lembar: " + this.getLembur());
        System.out.printf("Gaji lembur: %.0f\n", this.getGajiLembur());
        System.out.printf("Gaji : %.0f\n", this.getGaji());
}
