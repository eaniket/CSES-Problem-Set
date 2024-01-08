#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	string s = "abc";
	cin>>s;
	ll n = s.size(), l = 0, r = 0, temp = 0;
	if(n == 1){
		cout<<"1";
		return;
	}
	while(r<n){
		while(r<n && s[l] == s[r]){
			r++;
		}
		temp = max(temp, r-l);
		l=r;
	}
	cout<<max(temp, r-l);
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