public class task3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end--;
                continue;
            }

            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            ans.append(" ");
            ans.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (ans.length() > 0) {
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }
}
