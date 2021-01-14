/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_entity;
public class fadhil07216_PenyewaEntity extends fadhil07216_AdminAbstractEntity {
    private String jaminan,alamat;
    public fadhil07216_PenyewaEntity (String kode,String password,String nama,String no_telp,
            String alamat,String jaminan)
    {
        super(kode,password,nama,no_telp);
        this.alamat=alamat;
        this.jaminan=jaminan;
    }
    @Override
    public String getPassword()
    {
        return password;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getJaminan(){
        return jaminan;
    }
    public void setJaminan(String jaminan){
        this.jaminan=jaminan;
       }
}
