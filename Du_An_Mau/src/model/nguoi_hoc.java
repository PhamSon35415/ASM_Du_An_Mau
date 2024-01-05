/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class nguoi_hoc {
    private String manh;
    private String hoten;
    private String ngaysinh;
    private int gioitinh;
    private String dienthoai;
    private String email;
    private String ghichu;
    private String manv;
    private String ngaydk;
    public Object[] torownh(){
        return new Object[]{
          manh,hoten,ngaysinh,gioitinh,dienthoai,email,ghichu,manv,ngaydk  
        };
    }

    public nguoi_hoc(String manh, String hoten, String ngaysinh, int gioitinh, String dienthoai, String email, String ghichu, String manv, String ngaydk) {
        this.manh = manh;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.dienthoai = dienthoai;
        this.email = email;
        this.ghichu = ghichu;
        this.manv = manv;
        this.ngaydk = ngaydk;
    }

    public nguoi_hoc() {
    }

    public String getManh() {
        return manh;
    }

    public void setManh(String manh) {
        this.manh = manh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getNgaydk() {
        return ngaydk;
    }

    public void setNgaydk(String ngaydk) {
        this.ngaydk = ngaydk;
    }
    
}
