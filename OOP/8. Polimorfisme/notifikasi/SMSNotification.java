public class SMSNotification implements InterfaceNotifikasi {
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan isi " + content);
        System.out.println(content);
    }    
}
