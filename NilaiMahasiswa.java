import java.util.Scanner;

public class NilaiMahasiswa {
    static int JUMLAH_MINGGU;
    static int JUMLAH_MAHASISWA;

    static int[][] nilaiMahasiswa;
    static String[] namaMhs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        JUMLAH_MAHASISWA = scanner.nextInt();

        System.out.print("Masukkan jumlah minggu: ");
        JUMLAH_MINGGU = scanner.nextInt();

        nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];
        namaMhs = new String[JUMLAH_MAHASISWA];

        inputDataNilai(scanner);
        tampilkanNilaiMahasiswa();
        int hariTertinggi = cariHariTertinggi();
        System.out.println("Nilai tertinggi terdapat pada hari ke-" + hariTertinggi);
        tampilkanMahasiswaTertinggi();
    }

    static void inputDataNilai(Scanner scanner) {
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("\nMasukkan nama Mahasiswa " + (i + 1) + ": ");
            namaMhs[i] = scanner.next();
            System.out.println("Masukkan nilai mahasiswa: ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }

            scanner.nextLine();
        }
    }



    static void tampilkanNilaiMahasiswa() {
        System.out.println("Tabel Nilai Mahasiswa:");
        System.out.printf("%-15s", "Nama Mahasiswa");

        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            System.out.printf("%-10s", "Minggu " + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.printf("%-15s", namaMhs[i]);
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.printf("%-10d", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
    }

    static int cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            int totalNilaiHari = 0;

            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                totalNilaiHari += nilaiMahasiswa[i][j];
            }

            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j + 1;
            }
        }

        return hariTertinggi;
    }

    static void tampilkanMahasiswaTertinggi() {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            int totalNilaiMahasiswa = 0;

            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                totalNilaiMahasiswa += nilaiMahasiswa[i][j];
            }

            if (totalNilaiMahasiswa > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMahasiswa;
                mahasiswaTertinggi = i + 1;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMhs[mahasiswaTertinggi - 1] +
                " dengan nilai " + nilaiTertinggi +
                " (Minggu ke-" + cariHariTertinggi() + ")");
    }
}
