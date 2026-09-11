public class LongestSubstring {
    public static void main(String[] args) {

        String s = "abcabcbb";

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            int length = 0;

            for (int j = i; j < s.length(); j++) {

                boolean repeated = false;

                for (int k = i; k < j; k++) {
                    if (s.charAt(j) == s.charAt(k)) {
                        repeated = true;
                        break;
                    }
                }

                if (repeated) {
                    break;
                }

                length++;
            }

            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println(maxLength);
    }
}
