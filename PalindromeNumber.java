class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int re = 0;
        while(num>0){
            int LD = num%10;
            re = re*10+LD;
            num = num/10;
        }
        return re==x;
    }
}