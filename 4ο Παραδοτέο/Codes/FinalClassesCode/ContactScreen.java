public class ContactScreen {
    private Message message;

    public void display() {
        // Logic to display the contact form screen
        System.out.println("Displaying contact screen...");
    }

    public void fillForm(String sender, String receiver, String subject, String body) {
        // Logic to fill the form and create a message
        message = new Message(sender, receiver, subject, body);
        System.out.println("Message form filled:");
        System.out.println("From: " + message.getSender());
        System.out.println("To: " + message.getReceiver());
        System.out.println("Subject: " + message.getSubject());
        System.out.println("Body: " + message.getBody());
    }
}
