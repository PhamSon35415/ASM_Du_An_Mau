/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.*;
import java.sql.*;
import model.khoa_hoc;

/**
 *
 * @author Admin
 */
public class khoahocSV {

    List<khoa_hoc> list;
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<khoa_hoc> getallhv() {
        list = new ArrayList<>();
        sql = "select MaKh, MaCd, HocPhi, ThoiLuong, NgayKg, GhiChu, MaNv, NgayTao from KhoaHoc";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                khoa_hoc ue = new khoa_hoc(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
                         rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                list.add(ue);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public int addkh(khoa_hoc kh) {
        sql = "insert into HocVien (MaCd, HocPhi, ThoiLuong, NgayKg, GhiChu, MaNv, NgayTao) values (?,?,?,?,?,?,?,?)";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, kh.getMacd());
            ps.setObject(2, kh.getHocphi());
            ps.setDouble(3, kh.getThoiluong());
            ps.setObject(4, kh.getNgaykg());
            ps.setObject(5, kh.getGhichu());
            ps.setObject(6, kh.getManv());
            ps.setObject(7, kh.getNgaytao());
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }

    public int update(String makh, khoa_hoc kh) {
        sql = "update KhoaHoc set MaCd=?, HocPhi=?, ThoiLuong=?"
                + ", NgayKg=?, GhiChu=?, MaNv=?, NgayTao=? where Makh like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, kh.getMacd());
            ps.setObject(2, kh.getHocphi());
            ps.setDouble(3, kh.getThoiluong());
            ps.setObject(4, kh.getNgaykg());
            ps.setObject(5, kh.getGhichu());
            ps.setObject(6, kh.getManv());
            ps.setObject(7, kh.getNgaytao());
            ps.setObject(8, makh);
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }

    public int deleteCd(String makh) {
        sql = "delete KhoaHoc where MaKh like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, makh);
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }

    public List<khoa_hoc> timkiem(String ma) {
        list = new ArrayList<>();
        sql = "select MaKh, MaCd, HocPhi, ThoiLuong, NgayKg, GhiChu, MaNv, NgayTao from KhoaHoc where MaKh like ? ";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                khoa_hoc ue = new khoa_hoc(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
                         rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                list.add(ue);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }
}
