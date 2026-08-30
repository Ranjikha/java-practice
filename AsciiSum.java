public class AsciiSum {
    public static void main(String[] args) {

        String str = "ABC";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum = sum + str.charAt(i);
        }

        System.out.println("ASCII Sum = " + sum);
    }
}
