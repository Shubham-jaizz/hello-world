#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
vector<char> segmentedSieve(long long L, long long R) {
    // generate all primes up to sqrt(R)
    long long lim = sqrt(R);
    vector<char> mark(lim + 1, false);
    vector<long long> primes;
    for (long long i = 2; i <= lim; ++i) {
        if (!mark[i]) {
            primes.emplace_back(i);
            for (long long j = i * i; j <= lim; j += i)
                mark[j] = true;
        }
    }

    vector<char> isPrime(R - L + 1, true);
    for (long long i : primes)
        for (long long j = max(i * i, (L + i - 1) / i * i); j <= R; j += i)
            isPrime[j - L] = false;
    if (L == 1)
        isPrime[0] = false;
    return isPrime;
}
 
int main(){
    ios_base::sync_with_stdio(false);
    int t;cin>>t;
    while(t--){
    long long l,r;
    cin>>l>>r;
    vector<char>ans = segmentedSieve(l,r);
    for(long long i = 0;i<ans.size();i++){
       if(ans[i]==true){
           cout<<l+i<<endl;
       } 
    }
    cout<<endl;
    }
    return 0;
}
