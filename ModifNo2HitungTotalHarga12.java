import java.util.Scanner;
public class ModifNo2HitungTotalHarga12 {

    public static int HitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
            System.out.println("Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin Anda pesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
