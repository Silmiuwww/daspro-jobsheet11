import java.util.Scanner;
public class Percobaan612 {
    static int hitungLuas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int pjg, int lb) {
        int volume = hitungLuas(pjg, lb) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.println("Masukkan panjang: ");
        p = input.nextInt();
        System.out.println("Masukkan lebar: ");
        l = input.nextInt();
        System.out.println("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        vol = hitungVolume(t, p, l);

        System.out.println("Luas Persegi Panjang adalah: " + L);
        System.out.println("Volume Balok adalah: " + vol);

    }
}

