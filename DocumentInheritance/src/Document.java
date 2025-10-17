public class Document {
    private String text;

    public Document() {
        this.text = "";
    }

    public Document(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static void main(String[] args) {
        Document docOne = new Document("Hello this a test!");
        Email emailOne = new Email(docOne.getText(), "DG", "SA", "Test File");
        File fileOne = new File(emailOne.toString(), "c://path.");
        System.out.println(fileOne.toString());
        System.out.println(ContainsKeyword(docOne, "Hello"));
    }

    public static boolean ContainsKeyword(Document docObject, String keyword) {
        if (docObject.toString().indexOf(keyword, 0) >= 0) {
            return true;
        }
        return false;
    }
}