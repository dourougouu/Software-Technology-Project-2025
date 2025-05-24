public class Message {
    private String sender;
    private String receiver;
    private String subject;
    private String body;

    public Message(String sender, String receiver, String subject, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    public Boolean save() { return true; }
    public boolean update() { return true; }
}
