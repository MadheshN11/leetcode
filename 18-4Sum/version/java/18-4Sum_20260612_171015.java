// Last updated: 6/12/2026, 5:10:15 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String k=s.trim();
4        String[]words=k.split("\\s+");
5        String w=words[words.length-1];
6        return w.length();
7    }
8}