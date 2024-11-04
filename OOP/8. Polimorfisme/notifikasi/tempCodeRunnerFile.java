public class Main {
    public static void main(String[] args) {
        String emailPenerima = "dian@petanikode.com";
        String nomerHp = "+62811111111";
        String mobileId = "android-123456";

        EmailNotification emailNotif = new EmailNotification();
        PushNotification pushNotif = new PushNotification();
        SMSNotification smsNotif = new SMSNotification();

        String message = "Selamat, anda mendapat hadiah dari PT. XYZ";

        emailNotif.sendMessage(emailPenerima, message);
        pushNotif.sendMessage(nomerHp, message);
        smsNotif.sendMessage(mobileId, message);
    }
}
