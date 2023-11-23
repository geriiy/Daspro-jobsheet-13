import java.util.Scanner;

public class UcapanTerimakasih_12 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + "you inspired in me a love for learning and made me feel like I could ask you anything.");

        UcapanTambahan("You're truly amazing!");
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}
