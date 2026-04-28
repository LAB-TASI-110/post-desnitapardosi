package model;

import java.util.HashMap;

public class Model3 {

    HashMap<String, String> namaMenu = new HashMap<>();
    HashMap<String, Integer> hargaMenu = new HashMap<>();

    // set menu + harga dari input
    public void setMenu(String kode, String nama, int harga) {
        namaMenu.put(kode, nama);
        hargaMenu.put(kode, harga);
    }

    // cek menu
    public boolean isMenuValid(String kode) {
        return namaMenu.containsKey(kode);
    }

    // ambil nama
    public String getNama(String kode) {
        return namaMenu.get(kode);
    }

    // ambil harga
    public int getHarga(String kode) {
        return hargaMenu.get(kode);
    }

    // subtotal
    public int hitungSubtotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    // kembalian
    public int hitungKembalian(int bayar, int total) {
        return bayar - total;
    }
}