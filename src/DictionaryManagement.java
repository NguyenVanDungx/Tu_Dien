import java.util.Scanner;

public class DictionaryManagement {
    public void insertFromCommandline() {
        Word[] words = new Word[200000];

        Scanner sc = new Scanner(System.in);
        int cntWord = sc.nextInt();

        for (int i = 0; i < cntWord; i++) {
            String wt, we;
            wt = sc.next();
            we = sc.next();
            words[i] = new Word(wt, we);
        }

    }
}
