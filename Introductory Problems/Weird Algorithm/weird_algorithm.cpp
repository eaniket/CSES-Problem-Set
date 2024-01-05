#include<bits/stdc++.h>
using namespace std;
#define ll long long int


void repeat(ll n){
	if(n == 1){
		cout<<n;
		return;
	}
	cout<<n<<" ";
	n = (n%2) ? 3*n+1 : n/2;
	repeat(n);
}

void solve(){
	ll n;
	cin>>n;
	repeat(n);
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