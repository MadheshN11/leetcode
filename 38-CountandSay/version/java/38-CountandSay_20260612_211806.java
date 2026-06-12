// Last updated: 6/12/2026, 9:18:06 PM
1class Solution {
2    public String countAndSay(int n) {
3        if(n==1)return "1";
4        String a="1";
5        for(int i=1;i<n;i++){
6            StringBuilder k=new StringBuilder();
7            int count =1;
8        
9        for(int j=0;j<a.length();j++){
10         if(j+1 < a.length()&& a.charAt(j)==a.charAt(j+1)){
11            count++;
12         }
13         
14         else{
15            k.append(count).append(a.charAt(j));
16            count=1;
17         }
18        }    
19        a=k.toString(); 
20        }
21        return(a);     
22    }
23}