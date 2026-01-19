class Solution {
    public int reverse(int x) {
        int re = 0;
        while(x!=0){
            int Ld = x%10;
            x=x/10;
            if (re > Integer.MAX_VALUE / 10 || re < Integer.MIN_VALUE / 10){
                return 0;
            }
             re = re*10+Ld;
        }
        return re;
    }
}