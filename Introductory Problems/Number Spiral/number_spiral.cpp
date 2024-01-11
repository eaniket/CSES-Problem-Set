#include<bits/stdc++.h>
using namespace std;
#define ll long long int

// Time taken: 5m 17s

void solve(){
	ll row, col, ans;
	cin>> row >> col;
	if(row > col){
		ans = (row%2) ? (row-1)*(row-1) + col : row*row-col+1;
	}else{
		ans = (col%2) ? col*col - row + 1 : (col-1)*(col-1) + row;
	}
	cout<<ans<<endl;
	return; 
	
}

int main(){
	long long testCases;
	// testCases = 1;
	cin>>testCases;
	while(testCases--){
		solve();
	}
	return 0;
}