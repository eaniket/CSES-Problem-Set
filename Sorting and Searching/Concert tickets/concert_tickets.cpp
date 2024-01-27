#include<bits/stdc++.h>
using namespace std;
#define ll long long int


void solve(){
	int n, m, ans = 0, temp;
	cin>>n>>m;
	multiset<int> tixs;

	for(int i=0;i<n;i++){
		cin>>temp;
		tixs.insert(temp);
	}
	for(int i=0;i<m;i++){
		cin>>temp;
		auto pos = tixs.upper_bound(temp);
		if(pos == tixs.begin()){
			cout<<"-1"<<endl;
		}else{
			pos--;
			cout<<(*pos)<<endl;
			tixs.erase(pos);
			
		}
	}
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