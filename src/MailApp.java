public class MailApp {
    public static void main(String[] args) {
        Mail m = new Mail();
        m.printMail();

        Mail m2 = new Mail("r.zaugg@hf-ict.ch", "info@hf-ict.ch");
        m2.printMail();

        Mail m3 = new Mail("r.zaugg@hf-ict.ch", "info@hf-ict.ch", "ATL");
        m3.printMail();
    }
}
