#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	int n, x, ans = 0, temp;
	cin>>n>>x;
	vector<int> wts(n);
	for(int i=0;i<n;i++){
		cin>>temp;
		wts[i] = temp;
	}
	sort(wts.begin(), wts.end());
	int l=0, r= n-1;
	while(l<r){
		ans++;
		if(wts[l]+wts[r] <= x){
			l++;
			r--;
		}else{
			r--;
		}
	}
	if(l == r) ans++;
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