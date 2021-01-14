/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_entity;
    public class fadhil07216_Adminentity extends fadhil07216_AdminAbstractEntity {
    private String umur;
    public fadhil07216_Adminentity (String kode,String password,String nama,String no_telp,String umur)
    {
        super(kode,password,nama,no_telp);
    }
    @Override
    public String getPassword()
    {
        return password;
    }
    public String getUmur(){
        return umur;
    }
    public void setUmur(String umur){
        this.umur=umur;
    }
    }

