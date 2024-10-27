/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author yogen
 */
public class file extends JFrame {
    file(){
        setSize(900,400);
        setLocation(300,200);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        add(p1);
        setVisible(true);
    }
    public static void main(String[] args)
    {
       new file();  // anonimous object
    }
}
