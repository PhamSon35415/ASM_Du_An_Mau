/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
/**
 *
 * @author Admin
 */
public class icon {
    public static Image getAppIcon(){
        URL url=icon.class.getResource("D:\\FPT\\ky4\\DuAnMau\\ASM\\logo.vng");
        return new ImageIcon(url).getImage();
    }
}