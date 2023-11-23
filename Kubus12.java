import java.util.Scanner;

public class Kubus12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        double volume = hitungVolumeKubus(sisi);
        double luasPermukaan = hitungLuasPermukaanKubus(sisi);

        System.out.println("Volume kubus               : " + volume);
        System.out.println("Luas permukaan kubus       : " + luasPermukaan);
    }

    static double hitungVolumeKubus(double sisi) {
        return Math.pow(sisi, 3);
    }

    static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
}
