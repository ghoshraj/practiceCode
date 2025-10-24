package leetcode;

public class longestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxzfreq = 0;
        int arr[] = new int[26];
        int res = 0;
        while (right < s.length()) {
            arr[s.charAt(right) - 'A']++;
            maxzfreq = Math.max(maxzfreq, arr[s.charAt(right) - 'A']);
            int window = right - left + 1;
            if (window - maxzfreq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
    
}
