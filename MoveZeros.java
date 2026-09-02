class MoveZeros {
    public static void main(String[] args) {

        int[] a = {0, 5, 0, 10, 3, 0, 8};

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        while (index < a.length) {
            a[index] = 0;
            index++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
