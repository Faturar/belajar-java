public class PushNotification implements InterfaceNotifikasi {
    @Override
    public void sendMessage(String reviever, String content) {
        System.out.println("Mengirim push ke " + reviever + " dengan isi " + content);
        System.out.println(content);
    }
}