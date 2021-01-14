/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_model;
import fadhil07216_entity.fadhil07216_Daftarbarangentity;
import fadhil07216_entity.fadhil07216_jumlahentity;
import java.text.ParseException;
import java.util.ArrayList;
public class fadhil07216_Daftarbarangmodel implements fadhil07216_modelinterfaces {
        private ArrayList<fadhil07216_Daftarbarangentity> daftarbarangArrayList;
    public fadhil07216_Daftarbarangmodel(){
        daftarbarangArrayList = new ArrayList<fadhil07216_Daftarbarangentity>();
    }
    public void insertDataDaftarbarang(fadhil07216_Daftarbarangentity daftarbarang){
        daftarbarangArrayList.add(daftarbarang);
    }
    public ArrayList<fadhil07216_Daftarbarangentity> getDaftarbarangArrayList(){
        return daftarbarangArrayList;
    }
     public void remove(int index){
        daftarbarangArrayList.remove(index);
    }
    
    
    @Override
    public int cekData(String kode, String password){
        int loop = 0;
        if(daftarbarangArrayList.size()==0){
            loop = -1;
        }else{
        for(int i=0;i<daftarbarangArrayList.size();i++){
            if(daftarbarangArrayList.get(i).getPenyewa().getKode().equals(kode)){
                loop = i;
                break;
            }else{
                loop = -2;
            }
            }
        }
        return loop;
    }
    public fadhil07216_Daftarbarangentity showDaftarbarang(int index){
        return daftarbarangArrayList.get(index);
    }
    public ArrayList<fadhil07216_Daftarbarangentity>alldataprak(){
        return daftarbarangArrayList;
    }
    }
    

