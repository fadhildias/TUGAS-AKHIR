/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadhil07216_entity;
public class fadhil07216_Daftarbarangentity {
    private fadhil07216_PenyewaEntity penyewa;
    private int IndexBarang;

    public fadhil07216_Daftarbarangentity(fadhil07216_PenyewaEntity penyewa, int IndexBarang) {
        this.penyewa = penyewa;
        this.IndexBarang = IndexBarang;
    }

    public fadhil07216_PenyewaEntity getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(fadhil07216_PenyewaEntity penyewa) {
        this.penyewa = penyewa;
    }

    public int getIndexBarang() {
        return IndexBarang;
    }

    public void setIndexBarang(int IndexBarang) {
        this.IndexBarang = IndexBarang;
    }
    }
