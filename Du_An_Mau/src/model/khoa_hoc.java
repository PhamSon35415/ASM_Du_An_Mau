/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class khoa_hoc {
    private String makh;
    private String macd;
    private double hocphi;
    private int thoiluong;
    private String ngaykg;
    private String ghichu;
    private String manv;
    private String ngaytao;
    public Object[] torowkh(){
        return new Object[]{
          makh,macd,hocphi,thoiluong,ngaykg,ghichu,manv,ngaytao
        };
    }

    public khoa_hoc(String makh, String macd, double hocphi, int thoiluong, String ngaykg, String ghichu, String manv, String ngaytao) {
        this.makh = makh;
        this.macd = macd;
        this.hocphi = hocphi;
        this.thoiluong = thoiluong;
        this.ngaykg = ngaykg;
        this.ghichu = ghichu;
        this.manv = manv;
        this.ngaytao = ngaytao;
    }

    public khoa_hoc() {
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMacd() {
        return macd;
    }

    public void setMacd(String macd) {
        this.macd = macd;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public String getNgaykg() {
        return ngaykg;
    }

    public void setNgaykg(String ngaykg) {
        this.ngaykg = ngaykg;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }
    
}
