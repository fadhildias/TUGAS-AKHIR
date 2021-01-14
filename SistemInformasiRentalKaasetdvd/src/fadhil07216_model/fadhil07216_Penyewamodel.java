/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_model;
import fadhil07216_entity.fadhil07216_PenyewaEntity;
import java.util.ArrayList;
public class fadhil07216_Penyewamodel implements fadhil07216_modelinterfaces {
    private ArrayList<fadhil07216_PenyewaEntity> penyewaentityArrayList;
     public fadhil07216_Penyewamodel(){
        penyewaentityArrayList=new ArrayList<fadhil07216_PenyewaEntity>();
    }
    public void insert(fadhil07216_PenyewaEntity penyewaEntity){
        penyewaentityArrayList.add(penyewaEntity);
    }
     public int size() {
      return penyewaentityArrayList.size();
    }
     public void remove(int index) {
        penyewaentityArrayList.remove(index);
    }
   
     
       public ArrayList<fadhil07216_PenyewaEntity> getPenyewaentityArrayList(){
        return penyewaentityArrayList;
    }
     
    
    @Override
    public int cekData(String kode,String Password){
        int loop=0;
        while(! penyewaentityArrayList.get(loop).getKode().equals(kode) && ! penyewaentityArrayList.get(loop).getPassword().equals(Password)){
            loop++;
        }
        return loop;
    }
    public fadhil07216_PenyewaEntity getPenyewaentityArrayList(int index){
        return  penyewaentityArrayList.get(index);
    }
}
