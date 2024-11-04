/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class SaldoTabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan saldo awal: Rp ");
        double saldoAwal = scanner.nextDouble();

        System.out.print("Masukkan bunga per bulan (%): ");
        double bungaBulanan = scanner.nextDouble();

        System.out.print("Masukkan lama menabung (bulan): ");
        int lamaMenabung = scanner.nextInt();

        // Hitung bunga dan saldo akhir
        double bunga = saldoAwal * (bungaBulanan / 100);
        double saldoAkhir = saldoAwal + (bunga * lamaMenabung);

        // Tampilkan hasil
        System.out.println("Saldo akhir setelah " + lamaMenabung + " bulan adalah Rp " + saldoAkhir);
    }
}