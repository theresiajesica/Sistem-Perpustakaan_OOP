//Kelompok Sistem Perpustakaan
package SistemPerpustakaan;

public class Buku {
    private String tipe;
    private String judul;
    private int biayaSewa;
    private int denda;
    private int lamaSewa;
    private int lamaTelat;
    
    public Buku(){
        
    }
    
    public Buku(String judul, String tipe, int biayaSewa, int denda){
        this.tipe = tipe;
        this.judul = judul;
        this.biayaSewa = biayaSewa;
        this.denda = denda;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public void setBiayaSewa(int biayaSewa){
        this.biayaSewa = biayaSewa;
    }
    
    public void setDenda(int denda){
        this.denda = denda;
    }
    
    public void setLamaSewa(int lamaSewa){
        this.lamaSewa = lamaSewa;
    }
    
    public void setLamaTelat(int lamaTelat){
        this.lamaTelat = lamaTelat;
    }
    
    public String getTipe(){
        return tipe;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public int getBiayaSewa(int lamaSewa){
        this.lamaSewa = lamaSewa;
        return biayaSewa *= lamaSewa;
    }
    
    public int getDenda(int lamaTelat){
        this.lamaTelat = lamaTelat;
        return denda *= lamaTelat;
    }    
}
