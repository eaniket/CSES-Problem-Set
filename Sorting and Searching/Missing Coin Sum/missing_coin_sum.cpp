#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	ll n, temp, sum = 0, ans;
	cin>>n;
	vector<int> arr(n);

	for(int i=0;i<n;i++){
		cin>>temp;
		arr[i] = temp;
	}

	sort(arr.begin(), arr.end());

	int i=0;
	while(i<n && arr[i]<=sum+1){
		sum+=arr[i];
		i++;
	}
	cout<<sum+1;
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