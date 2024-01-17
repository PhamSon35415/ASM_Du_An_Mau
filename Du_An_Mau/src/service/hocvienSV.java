/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.util.*;
import java.sql.*;
import model.hoc_vien;
/**
 *
 * @author Admin
 */
public class hocvienSV {
    List<hoc_vien> list;
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<hoc_vien> getallhv() {
        list=new ArrayList<>();
        sql = "select MaHv, MaKh, MaNh, Diem from HocVien";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                hoc_vien ue = new hoc_vien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
                list.add(ue);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public int addHv(hoc_vien hv) {
        sql = "insert into HocVien (MaKh, MaNh, Diem) values (?,?,?)";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, hv.getMakh());
            ps.setObject(2, hv.getManh());
            ps.setDouble(3, hv.getDiem());
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }

    public int update(String mahv, hoc_vien hv) {
        sql = "update HocVien set MaKh=?, MaNh=?, Diem=? where MaHv like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, hv.getMakh());
            ps.setObject(2, hv.getManh());
            ps.setDouble(3, hv.getDiem());
            ps.setObject(4, mahv);
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }
    public int deleteCd(String mahv){
        sql="delete HocVien where MaHv like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, mahv);
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }
    public List<hoc_vien> timkiem(String mahv) {
        list=new ArrayList<>();
        sql = "select MaHv, MaKh, MaNh, Diem from HocVien where MaHv like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, mahv);
            rs = ps.executeQuery();
            while (rs.next()) {
                hoc_vien ue = new hoc_vien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
                list.add(ue);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }
}
