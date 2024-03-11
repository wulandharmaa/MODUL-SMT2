import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Mahasiswa mhs = new Mahasiswa();

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Data Mahasiswa");
                System.out.println("2. Tampilkan Data Mahasiswa");
                System.out.println("3. Keluar");
                System.out.print("Pilihan Anda: ");
                String pilihan = scanner.nextLine();

                switch (pilihan) {
                    case "1":
                        System.out.print("Masukkan nama mahasiswa: ");
                        mhs.nama = scanner.nextLine();
                        System.out.print("Masukkan NIM mahasiswa: ");
                        mhs.nim = scanner.nextLine();

                        if (mhs.nim.length() != 15) {
                            System.out.println("Panjang NIM maximal 15 angka.");
                            continue;
                        }

                        System.out.print("Masukkan jurusan mahasiswa: ");
                        mhs.jurusan = scanner.nextLine();
                        System.out.println("Data mahasiswa berhasil ditambahkan.");
                        break;

                    case "2":
                        Mahasiswa.tampilUniversitas();
                        mhs.tampilDataMahasiswa();
                        break;

                    case "3":
                        System.out.println("Adios");
                        return;

                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                        break;
                }
            }
        }
    }
}