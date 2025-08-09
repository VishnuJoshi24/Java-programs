public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 's';
        if (!Character.isLetter(ch)) {
            System.out.println("Not a letter");
        } else if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
