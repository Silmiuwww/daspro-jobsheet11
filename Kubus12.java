import java. util. Scanner;
public class Kubus12 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi; 
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi);
    }

    public static void main(String[] args) {
        
        int sisiKubus = 5; 
        int volume = hitungVolume(sisiKubus);
        int luasPermukaan = hitungLuasPermukaan(sisiKubus);

        System.out.println("Sisi Kubus: " + sisiKubus);
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
