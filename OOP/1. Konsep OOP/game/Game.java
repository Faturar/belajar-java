public class Game {
    public static void main(String[] args) {
        Player fatur = new Player();

        fatur.name = "Fatur Ardiansyah Ramadhan";
        fatur.speed = 99;
        fatur.healthPoin = 0;

        fatur.run();

        if(fatur.isDead()) {
            System.out.println("Game over!");
        } 
    }
}
