#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	ll a, b;
	cin >> a >> b;
	if(a<b){
		swap(a,b);
	}
	if((a+b)%3 == 0 && a <=2*b)
		cout<<"YES\n";
	else
		cout<<"NO\n";
	return;
	
}

int main(){
	long long testCases;
	// testCases = 1;
	cin>>testCases;
	while(testCases--){
		solve();
	}
	return 0;
}