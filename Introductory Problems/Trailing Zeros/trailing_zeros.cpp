#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	ll n, ans = 0, deno = 5;
	cin>>n;
	while(n>=deno){
		ans += n/deno;
		deno *= 5;
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