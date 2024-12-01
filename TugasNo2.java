import java.util.Scanner;
public class TugasNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] sales = isianArray(menu);

        System.out.println("\nData Penjualan:");
        tampilArray(menu, sales);

        int[] totalPerHari = hitungTotalPerHari(sales);
        System.out.println("\nTotal Penjualan per Hari:");
        for (int i = 0; i < totalPerHari.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + totalPerHari[i]);
        }

        String menuTerlaris = cariMenuTerlaris(menu, sales);
        System.out.println("\nMenu dengan Penjualan Tertinggi: " + menuTerlaris);

        double[] rataRataPerMenu = hitungRataRataPerMenu(sales);
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%s: %.2f\n", menu[i], rataRataPerMenu[i]);
        }
    }

    public static int[][] isianArray(String[] menu) {
        Scanner scanner = new Scanner(System.in);
        int[][] sales = new int[menu.length][7];

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk " + menu[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }
        return sales;
    }

    public static void tampilArray(String[] menu, int[][] sales) {
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] hitungTotalPerHari(int[][] sales) {
        int[] totalPerHari = new int[7];

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < sales.length; i++) {
                totalPerHari[j] += sales[i][j];
            }
        }
        return totalPerHari;
    }

    public static String cariMenuTerlaris(String[] menu, int[][] sales) {
        int maxSales = 0;
        String terlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += sales[i][j];
            }
            if (total > maxSales) {
                maxSales = total;
                terlaris = menu[i];
            }
        }
        return terlaris;
    }

    public static double[] hitungRataRataPerMenu(int[][] sales) {
        double[] rataRata = new double[sales.length];

        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += sales[i][j];
            }
            rataRata[i] = (double) total / 7;
        }
        return rataRata;
    }
}
