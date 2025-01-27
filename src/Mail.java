public class Mail {

    private String sender = "";
    private String recipient = "";
    private String reference = "";
    private String body = "";

    public Mail() {
    }

    public Mail(String sender, String recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }

    public Mail(String sender, String recipient, String reference) {
        this.sender = sender;
        this.recipient = recipient;
        this.reference = reference;
    }

    public void printMail() {
        System.out.println("Von: " + this.sender);
        System.out.println("An: " + this.recipient);
        System.out.println("Betreff: " + this.reference);
        System.out.println("Body: " + this.body);
        System.out.println("------");
    }
}