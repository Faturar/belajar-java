public class Main {

    public static void main(String[] args) {
        
        Button btn = new Button();
        
        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
            }
        });
        
        // mencoba klik tombol
        btn.doClick();
        
    }
}