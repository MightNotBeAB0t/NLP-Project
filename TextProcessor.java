import java.util.ArrayList;

/**
 * Analyzes and processes text from a file
 */
public class TextProcessor {
    private String filename;
    private ArrayList<String> textList; 

    public TextProcessor(String filename) {
        this.filename = filename;
        // Using the provided FileReader utility
        this.textList = FileReader.toStringList(filename);
    }

    /**
     * Concatenates all lines into one large string for phrase searching
     * @return The entire essay as one String
     */
    public String getFullText() {
        String fullText = "";
        for (String line : textList) {
            fullText += line + " ";
        }
        return fullText.toLowerCase();
    }

    public ArrayList<String> getTextList() {
        return textList;
    }
}
