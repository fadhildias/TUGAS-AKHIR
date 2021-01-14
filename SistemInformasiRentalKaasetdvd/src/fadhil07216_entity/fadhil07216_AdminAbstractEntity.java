/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_entity;
    
public  abstract class fadhil07216_AdminAbstractEntity {
     public String password;
   protected String kode,nama,no_telp;
    public  fadhil07216_AdminAbstractEntity (String kode, String password, String nama, String no_telp) {
        this.kode = kode;
        this.password = password;
        this.nama= nama;
        this.no_telp = no_telp;
    }
   public fadhil07216_AdminAbstractEntity(){
       
   }
    public abstract String getPassword();
    public void setPassword(String password){
        this.password=password;
    }
    public String getKode()
    {
        return kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNo_telp(){
        return no_telp;
    }
    public void setNo_telp(String no_telp){
        this.no_telp=no_telp;
    }
   }
