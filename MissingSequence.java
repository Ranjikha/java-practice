public class MissingSequence {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 7};

        for (int i = 0; i < arr.length - 1; i++) {

            int current = arr[i];
            int next = arr[i + 1];

            for (int j = current + 1; j < next; j++) {
                System.out.print(j + " ");
            }
        }
    }
}
