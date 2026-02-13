// Last updated: 2/13/2026, 10:37:33 AM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        int[] indexInS = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            indexInS[s.charAt(i) - 'a'] = i;
        }
        
        for (int i = 0; i < t.length(); i++) {
            int originalIndex = indexInS[t.charAt(i) - 'a'];
            result += Math.abs(originalIndex - i);
        }
        
        return result;
    }
}
