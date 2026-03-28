class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Update frequency of current character
            freq[s.charAt(right) - 'A']++;
            
            // Track max frequency in current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
            
            // If window is invalid, shrink it
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}