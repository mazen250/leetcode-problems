import java.util.Arrays;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String word="";
        String[] words = s.split(" ");
        word = words[words.length-1];
        return word.length();
    }

    public static void main(String[] args) {
        lengthOfLastWord l = new lengthOfLastWord();
        l.lengthOfLastWord("this is a test ");
    }
}
