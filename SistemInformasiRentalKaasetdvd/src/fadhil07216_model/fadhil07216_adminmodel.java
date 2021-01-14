/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_model;
import fadhil07216_entity.fadhil07216_Adminentity;
import java.util.ArrayList;
public class fadhil07216_adminmodel implements fadhil07216_modelinterfaces  {
        private ArrayList<fadhil07216_Adminentity> adminEntityArrayList;
    
    public fadhil07216_adminmodel(){
        adminEntityArrayList = new ArrayList<fadhil07216_Adminentity>();
    }
    public void insert(fadhil07216_Adminentity adminEntity){ //method
        adminEntityArrayList.add(adminEntity);
    }
     @Override //untuk menurunkan sifat dari kelas induk
    public int cekData(String kodeadmin, String password) {
        int loop = 0;
        while (!adminEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    public fadhil07216_Adminentity getAdminEntityArrayList(int index){
        return adminEntityArrayList.get(index);
    }
    }
