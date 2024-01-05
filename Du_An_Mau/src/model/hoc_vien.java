/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class hoc_vien {
    private int mahv;
    private String makh;
    private String manh;
    private double diem;
    public Object[] torowhv(){
        return new Object[]{
          mahv,makh,manh,diem  
        };
    }

    public hoc_vien(int mahv, String makh, String manh, double diem) {
        this.mahv = mahv;
        this.makh = makh;
        this.manh = manh;
        this.diem = diem;
    }

    public hoc_vien(String makh, String manh, double diem) {
        this.makh = makh;
        this.manh = manh;
        this.diem = diem;
    }

    public hoc_vien() {
    }

    public int getMahv() {
        return mahv;
    }

    public void setMahv(int mahv) {
        this.mahv = mahv;
    }

    @Override
    public String toString() {
        return "hoc_vien{" + "mahv=" + mahv + ", makh=" + makh + ", manh=" + manh + ", diem=" + diem + '}';
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getManh() {
        return manh;
    }

    public void setManh(String manh) {
        this.manh = manh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
}
