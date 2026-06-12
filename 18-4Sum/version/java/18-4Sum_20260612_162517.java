// Last updated: 6/12/2026, 4:25:17 PM
1import java.math.BigInteger;
2class Solution {
3    public String multiply(String num1, String num2) {
4        BigInteger res= new BigInteger(num1);
5        BigInteger r=new BigInteger(num2);
6        BigInteger k=res.multiply(r);
7    
8        return k.toString();
9}}