/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENAMPILKAN DATA PERKENALAN MAHASISWA
 */
public class Mahasiswa {
    public String NIM;
    public String nama;
    
    public void perkenalan(){
        System.out.println("Hello Everyone");
        System.out.println("My NIM is " + this.NIM);
        System.out.println("My Name is " + this.nama);
        System.out.println();
    }
}
