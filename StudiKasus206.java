import java.util.Scanner;
public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlDokumen, peringkat, statusPKM;

        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine();
        System.out.print("Jumlah dokumen:");
        jmlDokumen = sc.nextInt();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            peringkat = sc.nextInt();
            if (peringkat >= 1 && peringkat <= 3) {
                if (jmlDokumen== 4) {
                    System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jmlDokumen) + " dokumen). Dana penghargaan tidak diberikan. ");
                }
            } else {
                System.out.println("Status: Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak) : ");
            statusPKM = sc.nextInt();
            
            if (statusPKM == 1) {
                if (jmlDokumen == 4) {
                    System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
                }
            } else {
                System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jmlDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
          System.out.println("Status: Kegiatan lainnya tidak memperolah dana penghargaan.");  
        }
    }
}
