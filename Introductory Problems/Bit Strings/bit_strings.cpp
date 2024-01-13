#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	ll n, ans = 1, mod = 1e9+7;
	cin>>n;
	for(int i=0;i<n;i++){
		ans = (ans*2)%mod;
	}
	cout<<ans;
	return;
	
}

int main(){
	long long testCases;
	testCases = 1;
	// cin>>testCases;
	while(testCases--){
		solve();
	}
	return 0;
}