public class StringService {
    public boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        if (input.equals(reversed)) {
            return true;
        }
        return false;
    }
}
