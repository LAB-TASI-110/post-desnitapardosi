package model;

public class Model2 {

    // pola kategori (sementara)
    public boolean isKategori(int index, String kategori) {
        if (kategori.equals("A") && index % 3 == 0) return true;
        if (kategori.equals("B") && index % 3 == 1) return true;
        if (kategori.equals("C") && index % 3 == 2) return true;
        return false;
    }

    public int hitungTotal(int[] stok, String kategori) {
        int total = 0;

        for (int i = 0; i < stok.length; i++) {
            if (isKategori(i, kategori)) {
                total += stok[i];
            }
        }

        return total;
    }
}