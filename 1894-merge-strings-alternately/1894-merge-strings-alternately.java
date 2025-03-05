class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int a =0;
        int b =0;
        int n1 = word1.length();
        int n2 = word2.length();
        while( a<n1|| b<n2)
        {
            if(a<n1)
            {
                ans = ans + word1.charAt(a);
                a++;
            }
             if(b<n2)
            {
                ans = ans + word2.charAt(b);
                b++;
            }
        }
            return ans;
        
    }
}