public class ExamResultSwitch {
    public static void main(String[] args) {
        int marks = 85;
        String result;

        switch (marks / 10) {
            case 10:
            case 9:
                result = "Excellent";
                break;
            case 8:
                result = "Very Good";
                break;
            case 7:
                result = "Good";
                break;
            case 6:
                result = "Fair";
                break;
            case 5:
                result = "Pass";
                break;
            default:
                result = "Fail";
        }

        System.out.println("Result: " + result);
    }
}
