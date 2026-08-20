class NthPrime {
    public static void main(String[] args) {

        int n = 5;
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;

            boolean prime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
            }
        }

        System.out.println(n + "th prime number = " + num);
    }
}
