package model;

public class Model1 {

    // Hitung berat Ucok (sementara 2x Butet)
    public int hitungBeratUcok(int beratButet) {
        return 2 * beratButet;
    }

    // Total berat
    public int hitungTotalBerat(int butet, int ucok) {
        return butet + ucok;
    }

    // Harga per kg
    public int getHarga(String kota) {
        if (kota.equals("MDN")) return 8000;
        if (kota.equals("BLG")) return 5000;
        if (kota.equals("JKT")) return 12000;
        if (kota.equals("SBY")) return 13000;
        return 0;
    }

    // Hitung ongkir
    public int hitungOngkir(int totalBerat, int harga) {
        return totalBerat * harga;
    }

    // Diskon (≥10 kg → 10%)
    public int hitungDiskon(int totalBerat, int totalHarga) {
        if (totalBerat >= 10) {
            return (int)(0.1 * totalHarga);
        }
        return 0;
    }

    // Info promo
    public String getPromo(int totalBerat) {
        if (totalBerat >= 10) return "Diskon 10%";
        return "Tidak ada promo";
    }
}