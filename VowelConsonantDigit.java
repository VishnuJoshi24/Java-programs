public class VowelConsonantDigit {
    public static void main(String[] args) {
        char ch = '9';
        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else if (Character.isLetter(ch))
            System.out.println("Consonant");
        else
            System.out.println("Other character");
    }
}
