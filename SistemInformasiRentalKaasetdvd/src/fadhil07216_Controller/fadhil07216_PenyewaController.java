/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_Controller;
import fadhil07216_View.fadhil07216_Allobjctrl;
import javax.swing.table.DefaultTableModel;
import fadhil07216_entity.fadhil07216_Daftarbarangentity;
import fadhil07216_entity.fadhil07216_PenyewaEntity;
import fadhil07216_entity.fadhil07216_jumlahentity;
import java.util.ArrayList;
import java.util.Date;
public class fadhil07216_PenyewaController  {
    int indexLogin = 0;
    public fadhil07216_PenyewaController(){
    }
     public ArrayList<fadhil07216_Daftarbarangentity> getData(){
        return fadhil07216_AllObjectModel.daftarbarangModel.getDaftarbarangArrayList();
    }
      public void daftarbarang(fadhil07216_PenyewaEntity penyewa,int IndexBarang){
         fadhil07216_AllObjectModel.daftarbarangModel.insertDataDaftarbarang(new fadhil07216_Daftarbarangentity(penyewa,IndexBarang));
     }
      
      public int size(){
          return fadhil07216_AllObjectModel.penyewaModel.size();
      }
    //@Override
    //public void login(String kode,String password){
      //  indexLogin = fadhil07216_AllObjectModel.penyewaModel.cekData(kode,password);
    //}
    public void insert(String kode,String password,String nama,String no_telp,String alamat,String jaminan){
       fadhil07216_AllObjectModel.penyewaModel.insert(new fadhil07216_PenyewaEntity(kode,password,nama,no_telp,alamat,jaminan));
    }
    public int cekpenyewa(String kode,String password){
        int cek = fadhil07216_AllObjectModel.daftarbarangModel.cekData(kode, password);
        return cek;   
        }
    public fadhil07216_PenyewaEntity penyewaentity(){
        return fadhil07216_AllObjectModel.penyewaModel.getPenyewaentityArrayList(indexLogin);
    }
     public void remove(int index) {
       fadhil07216_AllObjectModel.daftarbarangModel.remove(index);
    }
  
  public ArrayList<fadhil07216_Daftarbarangentity> cekDaftarPenyewa(){
    return fadhil07216_AllObjectModel.daftarbarangModel.getDaftarbarangArrayList();
    }
  
      public ArrayList<fadhil07216_Daftarbarangentity> cekDatadaftar(int index){
    return fadhil07216_AllObjectModel.daftarbarangModel.getDaftarbarangArrayList();
    }
     public fadhil07216_Daftarbarangentity showDaftarbarang(int index){
         return fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(index);
     }
       public DefaultTableModel dataTabelpembeli(){
        DefaultTableModel dtmpenyewa = new DefaultTableModel();
        Object[] kolom = {"Kode","Password", "Nama", "No Telepon","Alamat","Jaminan","Barang","Harga"};
        dtmpenyewa.setColumnIdentifiers(kolom);
        int size = fadhil07216_AllObjectModel.daftarbarangModel.alldataprak().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[8];
            data[0] = fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPenyewa().getKode();
            data[1] = fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPenyewa().getPassword();
            data[2] = fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPenyewa().getNama();
            data[3] = fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPenyewa().getNo_telp();
            data[4] = fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPenyewa().getAlamat();
            data[5] = fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPenyewa().getJaminan();
            data[6] = fadhil07216_jumlahentity.judulkaset[fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getIndexBarang()];
            data[7] = fadhil07216_jumlahentity.hargakaset[fadhil07216_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getIndexBarang()];
            dtmpenyewa.addRow(data);
        }
        return dtmpenyewa;
}
}
