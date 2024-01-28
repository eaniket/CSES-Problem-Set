#include<bits/stdc++.h>
using namespace std;
#define ll long long int


void solve(){
	int n, ans = 1, temp;
	cin>>n;
	vector<vector<int>> timing(n, vector<int>(2));

	for(int i=0;i<n;i++){
		cin>>temp;
		timing[i][0] = temp;
		cin>>temp;
		timing[i][1] = temp;
		swap(timing[i][0], timing[i][1]);
	}
	sort(timing.begin(), timing.end());

	int idx = 1, lastIdx = 0;
	while(idx < n){
		if(timing[idx][1] >= timing[lastIdx][0]){
			ans++;
			lastIdx = idx;
		}
		idx++;
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