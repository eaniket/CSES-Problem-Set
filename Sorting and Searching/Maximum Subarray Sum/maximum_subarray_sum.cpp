#include<bits/stdc++.h>
using namespace std;
#define ll long long int


void solve(){
	ll n, meh = 0, msf = INT_MIN, temp;
	cin>>n;
	vector<int> arr(n);

	for(int i=0;i<n;i++){
		cin>>temp;
		arr[i] = temp;
	}
	for(int i=0;i<n;i++){
		meh += arr[i];
		msf = max(msf, meh);
		if(meh < 0)
			meh = 0;
	}
	cout<<msf;
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