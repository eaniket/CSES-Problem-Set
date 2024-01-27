#include<bits/stdc++.h>
using namespace std;
#define ll long long int


void solve(){
	int n, ans = 0, temp;
	cin>>n;
	vector<int> arrival(n), dept(n);

	for(int i=0;i<n;i++){
		cin>>temp;
		arrival[i] = temp;
		cin>>temp;
		dept[i] = temp;
	}
	sort(arrival.begin(), arrival.end());
	sort(dept.begin(), dept.end());

	int cnt = 0, aPtr = 0, dPtr = 0;
	while(aPtr < n && dPtr < n){
		if(arrival[aPtr] < dept[dPtr]){
			cnt++;
			aPtr++;
			ans = max(ans, cnt);
		}else if(arrival[aPtr] > dept[dPtr]){
			cnt--;
			dPtr++;
		}else{
			aPtr++;
			dPtr++;
		}
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