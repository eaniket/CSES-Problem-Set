#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	int n, ans = 0;
	cin>>n;
	vector<int> arr(n);
	map<int, int> mp;
	
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

	int l=0, r=0;
	while(r<n){
		if(mp.find(arr[r]) != mp.end()){
			l = max(l, mp[arr[r]]+1);
		}
		mp[arr[r]] = r;
		ans = max(ans, r-l+1);
		r++;
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