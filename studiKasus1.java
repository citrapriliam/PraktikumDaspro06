import java.util.Scanner;
/**
 * studiKasus1
 */
public class studiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jmlCup, uangBayar;
        int ttlHarga, diskon = 0, ttlBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jmlCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        ttlHarga = jmlCup * hargaPerCup;

        if (ttlHarga >= 100000) {
            diskon = ttlHarga * 10 / 100;
        }
         ttlBayar = ttlHarga - diskon;

        System.out.println("Total harga: Rp " + ttlHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total bayar: Rp " + ttlBayar);

        if (uangBayar >= ttlBayar) {
            System.out.println("Kembalian: Rp " +(uangBayar - ttlHarga));
        } else {
            System.out.println("Kurang: Rp " + (uangBayar - ttlBayar));
        }
        sc.close();
    }
}