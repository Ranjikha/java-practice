public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};

        int n = 6;
        int total = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            total = total - arr[i];
        }

        System.out.println("Missing Number: " + total);
    }
}
