public class Main {
    public static void main(String[] args) {

        int n = 7;

        for (int i = n; i >= 1; i--) {

            // Left side
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Spaces
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
              }
