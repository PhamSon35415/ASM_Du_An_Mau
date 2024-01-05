/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class nhan_vien {
    private String manv;
    private String matkhau;
    private String hoten;
    private String vaitro;
    public Object[] torownv(){
        return new Object[]{
          manv,matkhau,hoten,vaitro  
        };
    }

    @Override
    public String toString() {
        return "nhan_vien{" + "manv=" + manv + ", matkhau=" + matkhau + ", hoten=" + hoten + ", vaitro=" + vaitro + '}';
    }

    public nhan_vien() {
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public nhan_vien(String manv, String matkhau, String hoten, String vaitro) {
        this.manv = manv;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.vaitro = vaitro;
    }
}
