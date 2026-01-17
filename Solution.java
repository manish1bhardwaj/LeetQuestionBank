public class Solution {
    public int numPrimeArrangements(int n) {
        if(n<=2){
            return 1;
        }
        boolean[] prime = new boolean[n];
        for(int i = 2;i<n;i++){
            prime[i]=true;
        }

        for(int i = 2;i*i<n;i++){
            if(prime[i]){
                for(int j = i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int count = 0;
        for(int i = 2;i<n;i++){
            if(prime[i]){
                count++;
            }
        }
        int NonPrime =n-count;

         // factorial multiplication
        long result = 1;
        int MOD = 1_000_000_007;

        for (int i = 2; i <= count; i++) {
            result = (result * i) % MOD;
        }

        for (int i = 2; i <= NonPrime; i++) {
            result = (result * i) % MOD;
        }

        return (int) result;

    }
} {
    
}
