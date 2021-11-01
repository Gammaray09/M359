package Unit5_WritingClasses.homework.FRQ;

public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess){
        String str = "";
        guess = guess.toUpperCase();
        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if(guess.substring(i,i+1).equals(word.substring(j, j+1))){
                    str += word.substring(j,j+1);

                } else if(guess.substring(i,i+1).indexOf(word.substring(j, j+1)) == -1){
                    str += "+";
                } else {
                    str += "*";
                }
            }
        }
        return str;
    }
}
