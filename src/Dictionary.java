import java.util.List;

public class Dictionary {
    public Word[] words = new Word[200000];
    private int cntWord;

    public Word getWords(int i) {
        return words[i];
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    public int getCntWord() {
        return cntWord;
    }

    public void setCntWord(int cntWord) {
        this.cntWord = cntWord;
    }

}
