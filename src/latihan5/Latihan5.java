/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 Karyawan
 */
public class Latihan5 {
    
    int jumlahKambing = 88;
    
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing "+jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing+5;
        System.out.println("Jumlah Kambing setelah ditambah : "+jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan5 kambingSusu = new Latihan5();
        kambingSusu.getJumlahKambing();
        kambingSusu.tambahKambing();
        kambingSusu.getJumlahKambing();
    }
    
}
