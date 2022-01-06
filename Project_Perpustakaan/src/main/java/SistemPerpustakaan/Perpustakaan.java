//Kelompok Sistem Perpustakaan
package SistemPerpustakaan;

public class Perpustakaan {
    public static void main(String[] args) {
        Buku OOP = new Buku("OOP", "Buku Belajar", 5000, 2000);
        Buku Matematika = new Buku("Matematika", "Buku Belajar", 3000, 1000);
        
        System.out.println("Peminjaman "+ OOP.getTipe()+ " "+OOP.getJudul()+
                " Selama 3 hari dengan biaya sewa sebesar RP. "+OOP.getBiayaSewa(3)+
                ",00. Apabila terlambar 2 hari, maka peminjam wajib membayar denda sebesar RP. "+
                OOP.getDenda(5)+",00.");
        
         System.out.println("Peminjaman "+ Matematika.getTipe()+ " "+Matematika.getJudul()+
                " Selama 3 hari dengan biaya sewa sebesar RP. "+Matematika.getBiayaSewa(2)+
                ",00. Apabila terlambar 2 hari, maka peminjam wajib membayar denda sebesar RP. "+
                Matematika.getDenda(3)+",00.");     
         
    }    
}
