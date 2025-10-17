public class Email extends Document {
    private String sender;
    private String recipient;
    private String title;

    public Email(String text, String sender, String recipient, String title) {
        super(text);
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Sender: " + sender + "\nRecipient: " + recipient +  "\nTitle" + title + "\n" + getText();
    }
}