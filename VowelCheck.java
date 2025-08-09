public class VowelCheck {
    public static void main(String[] args) {
        char ch = 'A';
        if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Not a vowel");
    }
}
