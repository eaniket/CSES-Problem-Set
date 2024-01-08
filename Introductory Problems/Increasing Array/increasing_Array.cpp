#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	int n;
	cin >> n;
	if(n == 1){
		cout<<"0";
		return;
	}
	vector<int> arr(n);
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	ll ans = 0;
	int curr = arr[0];
	for(int i=1;i<n;i++){
		if(curr>arr[i]){
			ans += (curr - arr[i]);
		}
		curr = max(curr, arr[i]);
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