// Last updated: 2/13/2026, 10:32:46 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        int r=0;
4        int o=x;
5        while(x>0){
6            int l=x%10;
7            r=(r*10)+l;
8            x=x/10;
9        }
10        return o==r;
11        
12    }
13}