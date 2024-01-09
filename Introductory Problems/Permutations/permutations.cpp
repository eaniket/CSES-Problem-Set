#include<bits/stdc++.h>
using namespace std;
#define ll long long int

// Time taken: 9m 33s

void solve(){
	int n;
	cin >> n;
	if(n == 1){
		cout<<"1";
		return;
	}
	if(n<=3){
		cout<<"NO SOLUTION";
		return;
	}
	cout<<"2";
	for(int i=4;i<=n;i+=2){
		cout<<" "<<i;
	}
	for(int i=1;i<=n;i+=2)
		cout<<" "<<i;
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