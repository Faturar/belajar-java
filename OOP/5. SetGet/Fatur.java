public class Fatur {
    public static void main(String[] args) {
        User fatur = new User();

        // menggunakan method setter
        fatur.setUsername("Fatur");
        fatur.setPassword("kopiJava");

        // menggunakan method getter
        System.out.println("Username: " + fatur.getUsername());
        System.out.println("Password: " + fatur.getPassword());  
    }
}
