/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.user;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class user_sv {

    List<user> list = new ArrayList<>();
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public user_sv() {
        sql = "select MaNv,MatKhau,VaiTro from NhanVien";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                user ue = new user(rs.getString(1), rs.getString(2), rs.getInt(3));
                list.add(ue);
            }

        } catch (SQLException e) {
        }
    }
    public int doimk(String tk,String mk){
        sql = "update NhanVien set MatKhau=? where MaNv like ? ";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, mk);
            ps.setObject(2, tk);
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }
    public boolean check_tkmk(String tk,String mk){
        for (user nv : list) {
            if(nv.getTk().equals(tk)&& nv.getMk().equals(mk)){
                return true;
            }
        }
        return false;
    }
    
}
