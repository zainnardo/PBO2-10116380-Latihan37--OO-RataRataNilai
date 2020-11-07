/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan37.oo.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Epsilon
 */
public class Value {
     public double rataRata;
    public double jmlNilai = 0;
    
    public void hitungNilai(int jmlSiswa) {
        int i;
        double nilai;
        Scanner value = new Scanner(System.in);
        
        for(i = 1; i <= jmlSiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = value.nextDouble();
            jmlNilai = jmlNilai + nilai;
        }
    }
    
    public double hitungRata2Nilai(double jmlNilai, int jmlSiswa) {
        rataRata = jmlNilai / jmlSiswa;
        return rataRata;
    }   
}
