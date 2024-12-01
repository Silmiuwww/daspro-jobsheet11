import java.util.Scanner;
public class ModifNo3HitungTotalHarga12 {
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
        int totalKeseluruhan = 0;

        System.out.println("===== MENU KAFE RESTO =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6, atau 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break; 
            }

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu yang Anda pilih tidak valid. Silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin Anda pesan: ");
            int banyakItem = sc.nextInt();

            totalKeseluruhan += HitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalKeseluruhan);

    }
}


