package fadhil07216_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class fadhil07216_GUI {
    JFrame LogReg = new JFrame();
     JLabel login,daftar,top;
     JLabel labelkodelogin,labelnama,labelpasswordlogin,labelno_telp,labelalamat,labelumur,labelkodedaftar,labelpassworddaftar,jaminanlabel;
     JTextField textkodelogin,textnama,textno_telp,textalamat,textkodedaftar,textjaminan,textumur;
     JButton check,reg;
     JPasswordField passwordlogin,passworddaftar;
     //private boolean ceklogin = false;
     public fadhil07216_GUI(){
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.MAGENTA);
        top = new JLabel("Toko Rental Kaset DVD");
        top.setBounds(150, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        
        login = new JLabel("Login Admin");
        login.setBounds(40, 120, 200, 50);
        login.setFont(new Font("Times New ROman",Font.BOLD,30));
        LogReg.add(login);  
        
        labelkodelogin = new JLabel("Kode");
        labelkodelogin.setBounds(30, 180, 30, 30);
        LogReg.add(labelkodelogin);
        
        textkodelogin = new JTextField();
        textkodelogin.setBounds(30, 210, 200, 30);
        LogReg.add(textkodelogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        LogReg.add(labelpasswordlogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        LogReg.add(passwordlogin);
        
        check = new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.YELLOW);
        LogReg.add(check);
        
        daftar = new JLabel("Daftar Admin");
        daftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        daftar.setBounds(400,100,200,100);
        LogReg.add(daftar);
        
        labelkodedaftar = new JLabel("Kode");
        labelkodedaftar.setBounds(400, 172, 30, 30);
        LogReg.add(labelkodedaftar);
        
        textkodedaftar = new JTextField();
        textkodedaftar.setBounds(400, 200, 200, 30);
        LogReg.add(textkodedaftar);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(400, 230, 100, 30);
        LogReg.add(labelpasswordlogin);
        
         passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 255, 200, 30);
        LogReg.add(passworddaftar);
        
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 285, 100, 30);
        LogReg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(400, 310, 200, 30);
        LogReg.add(textnama);
        
        labelno_telp = new JLabel("No Telepon");
        labelno_telp.setBounds(400, 337, 100, 30);
        LogReg.add(labelno_telp);
        
        textno_telp = new JTextField();
        textno_telp.setBounds(400, 365, 200, 30);
        LogReg.add(textno_telp);
        
        labelumur = new JLabel("Umur");
        labelumur.setBounds(400, 395, 100, 30);
        LogReg.add(labelumur);
        
        textumur = new JTextField();
        textumur.setBounds(400, 420, 200, 30);
        LogReg.add(textumur);
        
        reg = new JButton("Daftar");
        reg.setBounds(450, 470, 100, 40);
        reg.setBackground(Color.BLUE);
        LogReg.add(reg);

        LogReg.setVisible(true);//untuk membuat posisi frame di tengah
        LogReg.setLocationRelativeTo(null);
         LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
     check.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                
                    try{
                       fadhil07216_Allobjctrl.admin.adminentity();
                        fadhil07216_Allobjctrl.admin.login(textkodelogin.getText(), passwordlogin.getText());
                        String nama = fadhil07216_Allobjctrl.admin.adminentity().getNama();
                        JOptionPane.showMessageDialog(null,"selamat datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        fadhil07216_GUIMenu guimenu = new fadhil07216_GUIMenu();
                        LogReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"kode atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        
                    }
                }
            
        });
        reg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String kode = textkodedaftar.getText();
                    String password = passworddaftar.getText();
                    String nama = textnama.getText();
                    String no_telp = textno_telp.getText();
                    String umur = textumur.getText();
                    fadhil07216_Allobjctrl.admin.insert(kode, password, nama, no_telp, umur);
                    JOptionPane.showMessageDialog(null,"Registrasi Sukses","information",JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Penulisan Salah","Registrasi Gagal",JOptionPane.INFORMATION_MESSAGE);
                }
                }
            });
        }
        
         
        
     void kosong(){
        textkodedaftar.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textno_telp.setText(null);
        textumur.setText(null);
        textkodelogin.setText(null);
        passwordlogin.setText(null);
        
     }
        }

                 
                  
