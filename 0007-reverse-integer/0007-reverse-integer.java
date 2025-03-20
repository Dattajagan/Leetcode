class Solution {
    public int reverse(int x) {
        long finl = 1;
        if(x < 0){ x = -x; finl = -1; }
        long rev = 0;
        while(x != 0){
            rev = rev * 10 + x % 10;
            x = x/10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) (finl*rev) ;
    }
}