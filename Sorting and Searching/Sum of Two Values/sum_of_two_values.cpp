#include<bits/stdc++.h>
using namespace std;
#define ll long long int


void solve(){
	int n, x, temp;
	cin>>n>>x;
	vector<vector<int>> arr(n, vector<int>(2));

	for(int i=0;i<n;i++){
		cin>>temp;
		arr[i][0] = temp;
		arr[i][1] = i+1;
	}
	sort(arr.begin(), arr.end());

	int l = 0, r = n-1;
	while(l < r){
		if(arr[l][0] + arr[r][0] == x){
			cout<<arr[l][1]<<" "<<arr[r][1];
			return;
		}else if(arr[l][0] + arr[r][0] > x) r--;
		else l++;
	}
	cout<<"IMPOSSIBLE";
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