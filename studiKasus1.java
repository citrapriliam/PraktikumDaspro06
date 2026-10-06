import java.util.Scanner;
/**
 * studiKasus1
 */
public class studiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jmlCup, uangBayar;
        int ttlHarga, diskon, ttlBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jmlCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        ttlHarga = jmlCup * hargaPerCup;

    }
}