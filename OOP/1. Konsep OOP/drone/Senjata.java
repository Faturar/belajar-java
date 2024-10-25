class Senjata {
    // atribut
    String nama;
    int jumlahPeluru;
    
    // method
    void tembak(){
        //..
        // setelah nembak, kurangi peluru
        jumlahPeluru--;
    }

    void reload(){
        //..
        // kalau di-reload maka jumlah peluru diisi ulang
        jumlahPeluru = 300;
    }
}