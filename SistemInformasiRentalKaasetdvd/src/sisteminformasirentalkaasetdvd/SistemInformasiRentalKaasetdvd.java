/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisteminformasirentalkaasetdvd;
import fadhil07216_Controller.fadhil07216_PenyewaController;
import java.util.Scanner;
import fadhil07216_View.*;
import fadhil07216_Controller.fadhil07216_AdminController;
import fadhil07216_Controller.fadhil07216_AllObjectModel;
import fadhil07216_entity.fadhil07216_jumlahentity;
public class SistemInformasiRentalKaasetdvd {
  // private static fadhil07216_PenyewaController penyewa = new fadhil07216_PenyewaController();
    //private static Scanner input = new Scanner(System.in);
    //private static fadhil07216_AdminController dataadmin = new fadhil07216_AdminController();
  //static int cekadmin;
    //private static int pilbar;
    //static int cekpenyewa;
 
    public static void main(String[] args) {
       fadhil07216_GUI gui = new fadhil07216_GUI();
    }
}
        
        /*int loop = 0 ;        
            do{
           System.out.print("Selamat Datang di Rental Kaset DVD"
                   + "\n1. Daftar"
                   + "\n2. Login"
                   + "\n3. Exit"
                   + "\nPilih = ");
           int pilih = input.nextInt();
           if(pilih == 1){
               Daftar();
           }
           else if(pilih == 2){
               Login();
           }
           else{
               break;
           }
           }while(loop != 3);
           }
       
       static void Daftar(){
        System.out.print("Input Kode admin = ");
        String kodeadmin = input.next();
        System.out.print("Input Password = ");
        String password = input.next();
        System.out.print("Input nama = ");
        String nama_admin = input.next();
        System.out.print("Input No Telp = ");
        String no_telp_admin = input.next();
        System.out.print("Umur = ");
        String umur_admin = input.next();
        dataadmin.insert(kodeadmin,password,nama_admin,no_telp_admin,umur_admin);
       }
       
       static void Login(){
        int pil;
        System.out.print("Kode admin : ");
        String kodeadmin = input.next();
        System.out.print("Password : ");
        String password = input.next();
        try{
        dataadmin.login(kodeadmin, password);
        System.out.println("Selamat datang "+dataadmin.adminentity().getNama());
         System.out.println("========== Data Penyewa Rental Kaset DVD ==========");
        do{
        System.out.println("1. Peminjaman  ");
        System.out.println("2. Lihat  ");
        System.out.println("3. Update");
        System.out.println("4. Remove");
        System.out.println("5. Exit");
        System.out.print("Pilih = ");
        pil = input.nextInt();
        switch(pil){
            case 1 : Penyewa();
                     break;
            case 2 : view();
                  break;
            case 3:  System.out.print("Masukkan Password Lama:");
                     String passworddd =input.next();
                     update(passworddd);
                     break;
            case 4:  System.out.print("Masukkan Password :");
                     String passwordd =input.next();
                     remove(passwordd);
                     break;         
           }
        }while(pil !=5);
        }catch(Exception exception){
            System.out.println("Error/Salah");
        }
       }

       
       static void Penyewa()
       {
          System.out.print("Kode Penyewa :");
                String kode= input.next();
                System.out.print("Password :");
                String password = input.next();
              System.out.print("Nama Penyewa : ");
                String nama = input.next();
                System.out.print("No Hp      : ");
                String no_telp = input.next();
                System.out.print("Alamat     : ");
                String alamat = input.next();
                 System.out.print("Jaminan  : ");
                String jaminan= input.next();
             penyewa.insert(kode,password,nama,no_telp,alamat,jaminan);
               cekpenyewa =penyewa.cekpenyewa(kode, password);
             System.out.println(" Pilih Kaset Yang Di Pinjam ");
                 for(int i=0;i<fadhil07216_jumlahentity.judulkaset.length;i++){
                System.out.println(i+". "+fadhil07216_jumlahentity.judulkaset[i]);
                    }
                System.out.print("Judul VCD :");
                int pilbar = input.nextInt();
                penyewa.daftarbarang(penyewa.getData(), pilbar);
                
       }
       static void view()
       {                
            System.out.println("==========> Daftar Peminjam <==========");
            for(int i=0;i<penyewa.cekDaftarPenyewa(cekpenyewa).size();i++)
               
            {
               System.out.println("Kode penyewa = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getKode());
                System.out.println("Password penyewa ="+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getPassword());
                System.out.println("Nama Peminjam = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getNama());
                System.out.println("Nomor telepon = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getNo_telp());
               System.out.println("Alamat = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getAlamat());
              System.out.println("Jaminan = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getJaminan());
               System.out.println("Kaset yang di pinjam = "+fadhil07216_jumlahentity.judulkaset[penyewa.showDaftarbarang(i).getIndexBarang()]);
              System.out.println("Harga kaset :"+fadhil07216_jumlahentity.hargakaset[penyewa.showDaftarbarang(i).getIndexBarang()]);
                System.out.println("");
               
                  }
       }
     
       static void update(String password)
       {
      
             if(carikode(password)!=-1){
              System.out.print("Password baru :");
               String passwordbaru =input.next();
              penyewa.getData().password=passwordbaru;
                } else{
               System.out.println("password tidak ditemukan");
           }
         }
        static int carikode(String password)
        {
            int index=-1;
            for(int i=0;i<penyewa.cekDaftarPenyewa(cekpenyewa).size();i++){
              if(password.equals(penyewa.cekDaftarPenyewa(i).get(i).getPassword())){
                    index=i;
                    break;
                }
            }
            return index;
             }
       
       
       static void remove(String password)
       {
         if(carikode(password)!=-1){
               penyewa.remove(carikode(password));
             System.out.println("Data Terhapus");
          }else{
              System.out.println("Data tidak ditemukan");
          }
               }
       
    
       
    }*/
    

