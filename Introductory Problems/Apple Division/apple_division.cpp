#include<bits/stdc++.h>
using namespace std;
#define ll long long int

ll sum1, sum2, ans = INT_MAX;


void helper(vector<int> wt, int idx, int n, ll sum1, ll sum2){
	if(idx == n){
		ans = min(ans, abs(sum1-sum2));
		return;
	}
	helper(wt, idx+1, n, sum1+wt[idx], sum2);
	helper(wt, idx+1, n, sum1, sum2+wt[idx]);
	return;
}

void solve(){
	int n;
	cin>>n;
	vector<int> wt(n);
	for(int i=0;i<n;i++){
		cin>>wt[i];
	}
	helper(wt, 0, n, sum1, sum2);
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