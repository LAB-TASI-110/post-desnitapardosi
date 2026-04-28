package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model2 model = new Model2();

        int N = Integer.parseInt(input.nextLine());

        int[] stok = new int[N];
        String[] data = input.nextLine().split(" ");

        for (int i = 0; i < N; i++) {
            stok[i] = Integer.parseInt(data[i]);
        }

        String kategori = input.nextLine();

        int total = model.hitungTotal(stok, kategori);

        System.out.println("Total stok kategori " + kategori + " = " + total);

        input.close();
    }
}