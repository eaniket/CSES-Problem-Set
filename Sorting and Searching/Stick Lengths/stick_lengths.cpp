#include<bits/stdc++.h>
using namespace std;
#define ll long long int


void solve(){
	ll n, ans = 0, temp;
	cin>>n;
	vector<int> arr(n);

	for(int i=0;i<n;i++){
		cin>>temp;
		arr[i] = temp;
	}
	sort(arr.begin(), arr.end());
	int x = arr[n/2];
	for(int i=0;i<n;i++){
		ans += abs(x-arr[i]);
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