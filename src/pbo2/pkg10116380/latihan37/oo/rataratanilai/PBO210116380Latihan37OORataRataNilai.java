/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan37.oo.rataratanilai;

import java.util.Scanner;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang perhitungan Rata rata nilai mahasiswa
 * berdasarkan OO
 */
public class PBO210116380Latihan37OORataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jmlSiswa;
        Scanner scn = new Scanner(System.in);
        Value rata2 = new Value();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jmlSiswa = scn.nextInt();
        
        rata2.hitungNilai(jmlSiswa);
        System.out.println("Maka, Rata-rata nilainya adalah : " 
                + rata2.hitungRata2Nilai (rata2.jmlNilai, jmlSiswa));
        
        System.out.println("Developed by : Zain Achmad Rizqullah");
    }
    
}
