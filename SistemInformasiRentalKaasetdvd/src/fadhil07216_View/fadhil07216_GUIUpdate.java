/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class fadhil07216_GUIUpdate {

    JFrame update = new JFrame();
    JLabel top, labelupdt,labelpasswordbaru,labelupdate;
    JPasswordField  textpasswordbaru;
    JButton ganti, back;

    public fadhil07216_GUIUpdate(int index) {
        update.setSize(700, 630);
        update.setLayout(null);
        update.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("Toko Rental Kaset DVD");
        top.setBounds(150, 10, 600, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        update.add(top);
        
         labelupdate = new JLabel("Update Password");
        labelupdate.setBounds(250, 50, 300, 100);
        labelupdate.setFont(new Font("Times New Roman",Font.BOLD,35));
        update.add(labelupdate);
        
       labelpasswordbaru = new JLabel("Password baru");
        labelpasswordbaru.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelpasswordbaru.setBounds(250, 180, 300, 100);
        update.add(labelpasswordbaru);

        textpasswordbaru = new JPasswordField();
        textpasswordbaru.setBounds(240, 250, 200, 30);
        update.add(textpasswordbaru);

        ganti = new JButton("Update");
        ganti.setBounds(290, 300, 100, 40);
        ganti.setBackground(Color.BLUE);
        update.add(ganti);

        back = new JButton("Back");
        back.setBounds(500, 500, 100, 40);
        back.setBackground(Color.RED);
        update.add(back);

        update.setVisible(true);//untuk membuat posisi frame di tengah
        update.setLocationRelativeTo(null);
        update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ganti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String newpassword = textpasswordbaru.getText();
                    fadhil07216_Allobjctrl.penyewa.showDaftarbarang(index).getPenyewa().setPassword(newpassword);
                   JOptionPane.showMessageDialog(null,"Password sudah diganti", "information", JOptionPane.INFORMATION_MESSAGE);
                   
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Password Tidak Ditemukan", "information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fadhil07216_GUIView menu = new fadhil07216_GUIView();
            }
        });
        

    }

  
}
