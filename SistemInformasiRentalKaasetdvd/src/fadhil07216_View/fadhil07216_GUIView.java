/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_View;

import fadhil07216_Controller.fadhil07216_AllObjectModel;
import fadhil07216_Controller.fadhil07216_PenyewaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class fadhil07216_GUIView {
    private static fadhil07216_PenyewaController penyewa = new fadhil07216_PenyewaController();
    JFrame Penyewa = new JFrame();
    JTable tabelpenyewa = new JTable();
    JLabel top,labeldatapenyewa,labelkode,labelpassword;
    JTextField kodetext, passwordtext;
    JScrollPane scrollaslab = new JScrollPane(tabelpenyewa);
    JButton hapus,update,back;
    
    public fadhil07216_GUIView(){
        Penyewa.setSize(700, 630);
        Penyewa.setLayout(null);
        Penyewa.getContentPane().setBackground(Color.ORANGE);
        top = new JLabel("Toko Rental Kaset DVD");
        top.setBounds(150, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        Penyewa.add(top);
        
        labeldatapenyewa = new JLabel("Data Penyewa");
        labeldatapenyewa.setBounds(250, 50, 300, 100);
        labeldatapenyewa.setFont(new Font("Times New Roman",Font.BOLD,35));
        Penyewa.add(labeldatapenyewa);
        
         scrollaslab.setBounds(50, 150, 570, 200);
         tabelpenyewa.setModel(penyewa.dataTabelpembeli());
         Penyewa.add(scrollaslab);
        
         labelkode = new JLabel("Kode");
        labelkode.setBounds(50, 360, 100, 30);
        Penyewa.add(labelkode);

        kodetext = new JTextField();
        kodetext.setBounds(50, 390, 100, 30);
        Penyewa.add(kodetext);

        labelpassword = new JLabel("password");
        labelpassword.setBounds(200, 360, 100, 30);
        Penyewa.add(labelpassword);

        passwordtext = new JTextField();
        passwordtext.setBounds(200, 390, 100, 30);
        Penyewa.add(passwordtext);
        
         hapus= new JButton("Delete");
         hapus.setBounds(80, 500, 100, 40);
         hapus.setBackground(Color.RED);
         Penyewa.add(hapus);
          
         update= new JButton("Update");
         update.setBounds(300, 500, 100, 40);
         update.setBackground(Color.BLUE);
         Penyewa.add(update);
          
          back= new JButton("Back");
          back.setBounds(500, 500, 100, 40);
          back.setBackground(Color.RED);
          Penyewa.add(back);
          
          
        Penyewa.setVisible(true);//untuk membuat posisi frame di tengah
        Penyewa.setLocationRelativeTo(null);
        Penyewa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
           tabelpenyewa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpenyewa.getSelectedRow();
                kodetext.setText(fadhil07216_Allobjctrl.penyewa.dataTabelpembeli().getValueAt(i, 0).toString());
                passwordtext.setText(fadhil07216_Allobjctrl.penyewa.dataTabelpembeli().getValueAt(i, 1).toString());
               
            }
        });
            hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   Penyewa.dispose();
                String kode = kodetext.getText();
                String password = passwordtext.getText();
                int index = fadhil07216_Allobjctrl.penyewa.cekpenyewa(kode, password);
                fadhil07216_Allobjctrl.penyewa.remove(index);
                fadhil07216_GUIView guimenu =  new fadhil07216_GUIView();
               
            }
        });
            
             back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   fadhil07216_GUIMenu menu = new fadhil07216_GUIMenu();
            }
        });
             
              update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   Penyewa.dispose();
                String kode = kodetext.getText();
                String password = passwordtext.getText();
                int index = fadhil07216_Allobjctrl.penyewa.cekpenyewa(kode, password);
                new fadhil07216_GUIUpdate(index);
               
            }
        });
        
        
           
           

    }
        
    }


