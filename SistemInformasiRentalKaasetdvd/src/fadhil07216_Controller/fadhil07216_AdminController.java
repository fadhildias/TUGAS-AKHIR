/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_Controller;

import fadhil07216_entity.fadhil07216_Adminentity;
import fadhil07216_entity.fadhil07216_Daftarbarangentity;
import fadhil07216_entity.fadhil07216_PenyewaEntity;
import java.util.ArrayList;
import java.util.Date;
public class fadhil07216_AdminController implements fadhil07216_ControllerInterface {
     int indexLogin = 0;
    public fadhil07216_AdminController(){
    }
 
    @Override
    public void login(String kode , String password){
        indexLogin = fadhil07216_AllObjectModel.adminModel.cekData(kode, password);
    }
    public fadhil07216_Adminentity adminentity() {
        return fadhil07216_AllObjectModel.adminModel.getAdminEntityArrayList(indexLogin);
    }
    
    public void insert(String kode, String password ,String nama, String no_telp,String umur) {
        fadhil07216_AllObjectModel.adminModel.insert(new fadhil07216_Adminentity(kode,password,nama,no_telp,umur));
    }

   
}
