
public class BlogEntry {
    private String username;
    private String textEntry;
    private String date;

    public BlogEntry() {
        username = "No Username";
        textEntry = "No text entry";
        date = "No date";
    }

    public BlogEntry(String userName, String textEntry, String date) {
        setUsername(userName);
        setTextEntry(textEntry);
        setDate(date);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setTextEntry(String textEntry) {
        this.textEntry = textEntry;
    }

    public String getTextEntry() {
        return textEntry;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void displayEntry() {
        System.out.println("Username: " + getUsername());
        System.out.println("TextEntry: " + getTextEntry());
        System.out.println("Date: " + getDate());
    }

    public String getSummary() {
        if (textEntry.length() == 0) {
            return textEntry;
        }

        String summary = "";
        int amountWords = 1;
        for (int i = 0; i < textEntry.length(); i++) {
            summary = summary + textEntry.charAt(i);
            if (textEntry.charAt(i) == ' ') {
                amountWords++;
            }
            if (amountWords == 11) {
                return summary;
            }
        }
        return textEntry;
    }
}