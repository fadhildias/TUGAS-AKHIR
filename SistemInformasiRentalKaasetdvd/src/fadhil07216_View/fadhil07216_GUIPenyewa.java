/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_View;
import fadhil07216_entity.fadhil07216_PenyewaEntity;
import fadhil07216_entity.fadhil07216_Daftarbarangentity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import fadhil07216_entity.fadhil07216_jumlahentity;
public class fadhil07216_GUIPenyewa {
     JFrame Penyewa = new JFrame();
     JTextArea area = new JTextArea();
     JLabel top;
      JPasswordField textpassword;
     JLabel labelinputpenyewa,labelkode,labelpassword,labelnama,labelnotelp,labelalamat,labelumur,labeljaminan,labeldaftarkaset;
     JTextField textkode,textnama,textnotelp,textalamat,textumur,textjaminan;
      JButton back,input;
     JComboBox pilbar = new JComboBox(fadhil07216_jumlahentity.judulkaset);
     
     public fadhil07216_GUIPenyewa(){
        Penyewa.setSize(700, 630);
        Penyewa.setLayout(null);
        Penyewa.getContentPane().setBackground(Color.PINK);
        top = new JLabel("Toko Rental Kaset DVD");
        top.setBounds(150, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        Penyewa.add(top);
        
        labelinputpenyewa = new JLabel("Input Data Penyewa");
        labelinputpenyewa.setBounds(200, 50, 300, 100);
        labelinputpenyewa.setFont(new Font("Times New Roman",Font.BOLD,30));
        Penyewa.add(labelinputpenyewa);
         
        labelkode = new JLabel("Kode Penyewa");
        labelkode.setBounds(100, 100, 300, 100);
        labelkode.setFont(new Font("Times New Roman",Font.BOLD,20));
        Penyewa.add(labelkode);
         
         textkode = new JTextField();
         textkode.setBounds(100, 165, 200, 30);
         Penyewa.add(textkode);
         
         labelpassword = new JLabel("Password");
         labelpassword.setFont(new Font("Times New Roman",Font.BOLD,20));
         labelpassword.setBounds(100, 160, 300, 100);
         Penyewa.add(labelpassword);
        
        textpassword = new JPasswordField();
        textpassword.setBounds(100, 225, 200, 30);
        Penyewa.add(textpassword);
         
         labelnama = new JLabel("Nama");
         labelnama.setBounds(100, 220, 300, 100);
         labelnama.setFont(new Font("Times New Roman",Font.BOLD,20));
         Penyewa.add(labelnama);
         
         textnama = new JTextField();
         textnama.setBounds(100, 285, 200, 30);
         Penyewa.add(textnama);
         
         labelnotelp = new JLabel("No Telepon");
         labelnotelp.setBounds(100, 280, 300, 100);
         labelnotelp.setFont(new Font("Times New Roman",Font.BOLD,20));
         Penyewa.add(labelnotelp);
         
         textnotelp = new JTextField();
         textnotelp.setBounds(100, 345, 200, 30);
         Penyewa.add(textnotelp);
         
         labelalamat = new JLabel("Alamat");
         labelalamat.setBounds(100, 339, 300, 100);
         labelalamat.setFont(new Font("Times New Roman",Font.BOLD,20));
         Penyewa.add(labelalamat);
         
         textalamat = new JTextField();
         textalamat.setBounds(100, 400, 200, 30);
         Penyewa.add(textalamat); 
         
          labeljaminan = new JLabel("Jaminan");
         labeljaminan.setBounds(100, 390, 300, 100);
         labeljaminan.setFont(new Font("Times New Roman",Font.BOLD,20));
         Penyewa.add(labeljaminan);
         
         textjaminan = new JTextField();
         textjaminan.setBounds(100, 450, 200, 30);
         Penyewa.add(textjaminan); 
         
         labeldaftarkaset = new JLabel("Pilih kaset");
         labeldaftarkaset.setBounds(450, 100, 300, 100);
         labeldaftarkaset.setFont(new Font("Times New Roman",Font.BOLD,25));
         Penyewa.add(labeldaftarkaset);
         
          pilbar.setBounds(420, 170, 200, 30);
          Penyewa.add(pilbar);
           
          input= new JButton("OK");
          input.setBounds(100, 500, 100, 40);
          input.setBackground(Color.BLUE);
          Penyewa.add(input);
          
          back= new JButton("Back");
          back.setBounds(240, 500, 100, 40);
          back.setBackground(Color.RED);
          Penyewa.add(back);
         
        Penyewa.setVisible(true);//untuk membuat posisi frame di tengah
        Penyewa.setLocationRelativeTo(null);
        Penyewa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    
                    String kode = textkode.getText();
                    String pass = textpassword.getText();
                    String nama = textnama.getText();
                    String no_telp = textnotelp.getText();
                    String alamat = textalamat.getText();
                    String jaminan = textjaminan.getText();
                    int indexbarang = pilbar.getSelectedIndex();
                    fadhil07216_Allobjctrl.penyewa.daftarbarang(new fadhil07216_PenyewaEntity(kode,pass,nama,no_telp,alamat,jaminan), indexbarang);
                    JOptionPane.showMessageDialog(null, "Input Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    Penyewa.dispose();
                    fadhil07216_GUIMenu menu = new fadhil07216_GUIMenu();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
        });
         
          back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Penyewa.dispose();
                fadhil07216_GUIMenu menu = new fadhil07216_GUIMenu();
            }
        });
        
     
     }
}
