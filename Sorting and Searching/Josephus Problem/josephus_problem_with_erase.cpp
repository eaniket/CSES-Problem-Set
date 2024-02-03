#include<bits/stdc++.h>
using namespace std;
#define ll long long int
 
void solve(){
    int n, cnt = 0;
    
    cin>>n;
    vector<int> arr;
    for(int i=1;i<=n;i++){
        arr.push_back(i);
    }
 
    int idx = 0;
    while(arr.size() != 0){
    	idx = (idx + 1)%(arr.size());
    	cout<<arr[idx]<<" ";
    	arr.erase(arr.begin() + idx);
    }
    // cout<<arr[0];
    return;
}
 
int main(){
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    long long testCases;
	testCases = 1;
	// cin>>testCases;
	while(testCases--){
		solve();
	}
	
	return 0;
}