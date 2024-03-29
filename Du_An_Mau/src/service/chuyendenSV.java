/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.*;
import java.sql.*;
import model.chuyen_de;

/**
 *
 * @author Admin
 */
public class chuyendenSV {

    List<chuyen_de> list;
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<chuyen_de> getallcd() {
        list=new ArrayList<>();
        sql = "select MaCd, TenCd, HocPhi, ThoiLuong, Hinh, MoTa from ChuyenDe";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                chuyen_de ue = new chuyen_de(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
                         rs.getString(5), rs.getString(6));
                list.add(ue);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public int addCD(chuyen_de cd) {
        sql = "insert into ChuyenDe (MaCd, TenCd, HocPhi, ThoiLuong, Hinh, MoTa) values (?,?,?,?,?,?)";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, cd.getMacd());
            ps.setObject(2, cd.getTencd());
            ps.setObject(3, cd.getHocphi());
            ps.setObject(4, cd.getThoiluong());
            ps.setObject(5, cd.getHinh());
            ps.setObject(6, cd.getMota());
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }

    public int update(String macd, chuyen_de cd) {
        sql = "update ChuyenDe set TenCd=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? where MaCd like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, cd.getTencd());
            ps.setObject(2, cd.getHocphi());
            ps.setObject(3, cd.getThoiluong());
            ps.setObject(4, cd.getHinh());
            ps.setObject(5, cd.getMota());
            ps.setObject(6, macd);
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }
    public int deleteCd(String macd){
        sql="delete ChuyenDe where MaCd like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, macd);
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }
    public List<chuyen_de> timkiem() {
        list=new ArrayList<>();
        sql = "select MaCd, TenCd, HocPhi, ThoiLuong, Hinh, MoTa from ChuyenDe where MaCd like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                chuyen_de ue = new chuyen_de(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
                         rs.getString(5), rs.getString(6));
                list.add(ue);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }
}
