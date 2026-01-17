class Solution {                      //using Sieve of Eratosthenes
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        if(n<=2){
            return 0;
        }

        for(int i=2;i<n;i++){
            prime[i]=true; //Assume and Marking all number are prime;
        }

        for(int i = 2;i*i<n;i++){
            if(prime[i]){
                for(int j = i*i;j<n;j+=i){
                    prime[j]=false; //marking multiple of each no. not prime;
                }
            }
        }
        //now count remaining prime no. in array
        int count= 0;
        for(int i=2;i<n;i++){
            if(prime[i]){
                count++;
            }
        }
        return count;
    }
}