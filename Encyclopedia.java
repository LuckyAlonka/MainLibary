package library;

public class Encyclopedia extends Publication{
    private String editor;
    private int volume;
    public Encyclopedia (String title, String publisher, int qty, String editor, int volume){
        super(title,publisher, qty);
        this.editor = ((editor == null) || editor.isEmpty()) ? "unknown" : editor;
        this.volume = volume;
    }
    public String getEditor() {
        return editor;
    }

    public int getVolume() {
        return volume;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString(){
        return getNumOfPublication() + "-Ency   " + this.title + " vol. " + this.volume
                + "\n" + "          published by " + getPublisher() + " edited by " + editor;
    }

    public String type(){
        return "Encyclopedia";
    }
}
