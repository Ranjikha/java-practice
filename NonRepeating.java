public class NonRepeating {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 4};
        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) {

            for (int j = i; j < i + k; j++) {

                int count = 0;

                for (int x = i; x < i + k; x++) {
                    if (arr[j] == arr[x]) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
