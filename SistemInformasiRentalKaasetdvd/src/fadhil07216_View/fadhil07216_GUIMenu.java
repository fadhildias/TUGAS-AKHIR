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
public class fadhil07216_GUIMenu {
     JFrame LogReg = new JFrame();
     JLabel top;
     JButton peminjaman,view,update,remove,exit;
     
     public fadhil07216_GUIMenu(){
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.cyan);
        top = new JLabel("Toko Rental Kaset DVD");
        top.setBounds(150, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        
         peminjaman = new JButton("Peminjaman");
         peminjaman.setFont(new Font("Times News Roman",Font.BOLD,20));
         peminjaman.setBounds(200, 140, 300, 60);
         peminjaman.setBackground(Color.lightGray);
         LogReg.add(peminjaman);
         
         view = new JButton("Lihat Data");
         view.setFont(new Font("Times News Roman",Font.BOLD,20));
         view.setBounds(200, 210, 300, 60);
         view.setBackground(Color.lightGray);
         LogReg.add(view);
         
         exit = new JButton("Exit");
         exit.setFont(new Font("Times News Roman",Font.BOLD,20));
         exit.setBounds(200, 280, 300, 60);
         exit.setBackground(Color.RED);
         LogReg.add(exit);
        
         LogReg.setVisible(true);//untuk membuat posisi frame di tengah
        LogReg.setLocationRelativeTo(null);
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        peminjaman.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                fadhil07216_GUIPenyewa guipenyewa = new fadhil07216_GUIPenyewa();
                LogReg.dispose();
            }
           
        });
        
         view.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
               fadhil07216_GUIView guiview = new fadhil07216_GUIView();
                LogReg.dispose();
            }
           
        });
          exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
               fadhil07216_GUI guiview = new fadhil07216_GUI();
                LogReg.dispose();
            }
           
        });
         
         
    

     }
}
    

