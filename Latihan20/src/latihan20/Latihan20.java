/*
Nama : Evan Eka Laksana
 * Kelas : PBO1
 * NIM : 222050008
 * Deskripsi Program : Program ini berisi program untuk menampilkan Program Target Saldo Tabungan
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan20;


public class Latihan20 {

    
    public static void main(String[] args) {
        // Input saldo awal, bunga per bulan, dan saldo target
        double saldoAwal = 3500000;
        double bungaBulan = 8;
        double saldoTarget = 6000000;

        // Hitung bunga per bulan
        double bungaPerBulan = saldoAwal * bungaBulan / 100;

        // Hitung lama bulan untuk mencapai saldo target
        int lamaBulan = 1;
        double saldoAkhir = saldoAwal;
        while (saldoAkhir < saldoTarget) {
            saldoAkhir += bungaPerBulan;
            lamaBulan++;
        }

        // Output lama bulan untuk mencapai saldo target
        System.out.println("Perhitungan lama tabungan sampai mencapai saldo target.");
        System.out.println("Saldo Awal: Rp." + saldoAwal);
        System.out.println("Bunga/Bulan (%): " + bungaBulan);
        System.out.println("Saldo target: Rp." + saldoTarget);
        System.out.println("Output:");
        System.out.println("Lama bulan untuk mencapai saldo target: " + lamaBulan);
    }
}
    
    

