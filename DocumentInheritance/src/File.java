public class File extends Document{
    private String pathName;

    public File(String text, String pathName) {
        super(text);
        this.pathName = pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getPathName() {
        return pathName;
    }

    @Override
    public String toString() {
        return "Path Name: " + pathName + "\nText: " + getText();
    }

}
