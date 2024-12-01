import java. util. Scanner;
public class HitungTotalHarga12 {
    public static int HitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukan jumlah item yang ingin Anda pesan: ");
        int banyakItem = sc.nextInt();
 
        int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);

    }
}
