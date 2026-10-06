import java.util.Scanner;
public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlDokumen, peringkat, statusPKM;

        System.out.println("Nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            
        } else {
            
        }
    }
}
