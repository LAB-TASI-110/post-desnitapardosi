package driver;

import java.util.ArrayList;
import java.util.Scanner;
import model.Model1;

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model1 model = new Model1();

        ArrayList<String> data = new ArrayList<>();

        while (true) {
            String line = input.nextLine();

            if (line.equals("END")) {
                break;
            }

            data.add(line);
        }

        for (int i = 0; i < data.size(); i += 2) {
            String kota = data.get(i);
            int beratButet = Integer.parseInt(data.get(i + 1));

            int beratUcok = model.hitungBeratUcok(beratButet);
            int totalBerat = model.hitungTotalBerat(beratButet, beratUcok);
            int harga = model.getHarga(kota);
            int totalOngkir = model.hitungOngkir(totalBerat, harga);
            int diskon = model.hitungDiskon(totalBerat, totalOngkir);

            int totalBayar = totalOngkir - diskon;
            String promo = model.getPromo(totalBerat);

            System.out.println("Struk Pembayaran");
            System.out.println("Kota tujuan: " + kota);
            System.out.println("Berat paket Butet: " + beratButet + " kg");
            System.out.println("Berat paket Ucok: " + beratUcok + " kg");
            System.out.println("Total berat: " + totalBerat + " kg");
            System.out.println("Total ongkos kirim: " + totalBayar);
            System.out.println("Informasi promo: " + promo);
            System.out.println();
        }

        input.close();
    }
}