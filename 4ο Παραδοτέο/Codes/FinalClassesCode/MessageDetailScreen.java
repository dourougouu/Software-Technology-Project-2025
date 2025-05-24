public class MessageDetailScreen {
    private Message message;

    public MessageDetailScreen(Message message) {
        this.message = message;
    }

    public void Accept() {
        // Logic for accepting the message
        System.out.println("Message accepted from: " + message.getSender());
    }

    public void Deny() {
        // Logic for denying the message
        System.out.println("Message denied from: " + message.getSender());
    }

    public void show() {
        // Display message details
        System.out.println("From: " + message.getSender());
        System.out.println("To: " + message.getReceiver());
        System.out.println("Subject: " + message.getSubject());
        System.out.println("Body: " + message.getBody());
    }
}
