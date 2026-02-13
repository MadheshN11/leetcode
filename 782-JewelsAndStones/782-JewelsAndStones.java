// Last updated: 2/13/2026, 10:37:36 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }
        
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }
        
        return count;
    }
}
