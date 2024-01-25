#include<bits/stdc++.h>
using namespace std;
#define ll long long int

map<ll, ll> mp;

ll pow10(int i){
	ll num = 1;
	while(i--){
		num *= 10;
	}
	return num;
}


void solve(){
	ll k;
	cin>>k;
	if(k<=9){
		cout<<k<<endl;
		return;
	}
	k--;
	ll len = 1;
	while((9*len*pow10(len-1)) < k){
		k -= (9*len*pow10(len-1));
		len++;
	}
	string s = to_string((pow10(len-1)) + k/len);
	cout<< ((int)(s[k%len] - '0'))<<endl;
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