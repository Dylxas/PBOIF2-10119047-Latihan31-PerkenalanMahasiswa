/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan31.pekenalanmahasiswa;
import data.Mahasiswa;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENAMPILKAN DATA PERKENALAN MAHASISWA
 */

public class PBOIF210119047Latihan31PekenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa orang1 = new Mahasiswa();
        orang1.NIM = "10110269";
        orang1.nama = "Rizki Adam Kurniawan";
        orang1.perkenalan();
        
        Mahasiswa orang2 = new Mahasiswa();
        orang2.NIM = "10110270";
        orang2.nama = "Indra Tiola";
        orang2.perkenalan();     
        
        Mahasiswa orang3 = new Mahasiswa();
        orang3.NIM = "10110271";
        orang3.nama = "Robi Tanzil Ganefi";
        orang3.perkenalan();
        
        Mahasiswa orang4 = new Mahasiswa();
        orang4.NIM = "10110269";
        orang4.nama = "Muhammad Nur Awaludin";
        orang4.perkenalan();
        
    }
    
}
