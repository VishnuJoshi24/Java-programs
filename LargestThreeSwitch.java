public class LargestThreeSwitch {
    public static void main(String[] args) {
        int a = 30, b = 25, c = 40;
        int largest;
        largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        switch (largest) {
            case 30:
                System.out.println("Largest is: " + a);
                break;
            case 25:
                System.out.println("Largest is: " + b);
                break;
            case 40:
                System.out.println("Largest is: " + c);
                break;
        }
    }
}
