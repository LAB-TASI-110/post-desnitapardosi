package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model3 model = new Model3();

        int totalBayar = 0;

        // 🔥 INPUT DATA MENU DARI USER (KASIR)
        System.out.println("=== INPUT DATA MENU ===");
        System.out.print("Jumlah menu: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Kode menu   : ");
            String kode = input.nextLine();

            System.out.print("Nama menu   : ");
            String nama = input.nextLine();

            System.out.print("Harga menu  : ");
            int harga = Integer.parseInt(input.nextLine());

            model.setMenu(kode, nama, harga);
        }

        System.out.println("\n=== TRANSAKSI ===");
        System.out.println("Ketik END untuk selesai\n");

        // header
        System.out.printf("%-15s %-10s %-10s %-10s\n",
                "Menu", "Jumlah", "Harga", "Subtotal");
        System.out.println("----------------------------------------------");

        while (true) {
            System.out.print("Kode menu: ");
            String kode = input.nextLine();

            if (kode.equals("END")) break;

            if (!model.isMenuValid(kode)) {
                System.out.println("Menu tidak tersedia!");
                continue;
            }

            System.out.print("Jumlah: ");
            int jumlah = Integer.parseInt(input.nextLine());

            String nama = model.getNama(kode);
            int harga = model.getHarga(kode);
            int subtotal = model.hitungSubtotal(harga, jumlah);

            totalBayar += subtotal;

            System.out.printf("%-15s %-10d %-10d %-10d\n",
                    nama, jumlah, harga, subtotal);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Total Bayar : " + totalBayar);

        System.out.print("Masukkan pembayaran: ");
        int bayar = Integer.parseInt(input.nextLine());

        if (bayar < totalBayar) {
            System.out.println("Uang tidak cukup!");
        } else {
            int kembalian = model.hitungKembalian(bayar, totalBayar);
            System.out.println("Kembalian   : " + kembalian);
        }

        input.close();
    }
}