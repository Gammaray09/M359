package PersonalProjects.Wordscapes;

public class WordScapeSolver {
    public static void main(String[] args) {
        String letters = "force";
        solver("",letters);
    }


    public static void solver(String root, String l){
        if(l.length() == 0){
            System.out.println(root);
        }
        for (int i = 0; i < l.length(); i++) {
            System.out.println(root);
            solver(root + l.charAt(i), l.substring(0, i) + l.substring(i + 1));
        }

    }

    public static boolean checkWord(String word){
        return false;
    }
}
