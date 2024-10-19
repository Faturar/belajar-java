package input;
import java.util.Scanner;

public class ScannerBelajar {
    public static void main(String[] args) {
        String nama, alamat;
        int usia, gaji;

        Scanner input = new Scanner(System.in);

        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama Karyawan: ");

        nama = input.nextLine();

        System.out.print("Alamat: ");

        alamat = input.nextLine();

        System.out.print("Usia: ");
        usia = input.nextInt();

        System.out.print("Gaji: ");
        gaji = input.nextInt();

        // menampilkan data
        System.out.println("--------------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat " + alamat);
        System.out.println("Usia: " + usia + " Tahun");
        System.out.println("Gaji: Rp " + gaji);
    }
}
