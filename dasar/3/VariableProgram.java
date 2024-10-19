import java.util.Scanner;

public class VariableProgram {
    public static void main(String[] args) {
        Double luas;
        int alas, tinggi;

        Scanner baca = new Scanner(System.in);

        System.out.println("== Program hitung luas segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input Tinggi: ");
        tinggi = baca.nextInt();

        luas = Double.valueOf((alas * tinggi) / 2);

        System.out.println("Luas = " + luas);
    }
}
