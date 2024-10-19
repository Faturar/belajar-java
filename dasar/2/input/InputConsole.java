package input;
import java.io.Console;

public class InputConsole {
    public static void main(String[] args) {
        String nama;
        int usia;

        Console con = System.console();

        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
        usia = Integer.parseInt(con.readLine());

        // Menampilkan isinya
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia " + usia + " tahun");
    }
}
