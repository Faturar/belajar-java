package output;

public class OutFormat {
    public static void main(String[] args) {
        String namaDepan = "Fatur";
        String namaBelakang = "Ardiansyah Ramadhan";

        // %d untuk desimal atau angka;
        // %f untuk bilangan pecahan;
        // %n untuk baris baru, bisa juga pakai \n;

        System.out.format("Nama saya %s %s %n", namaDepan, namaBelakang);
    }    
}
