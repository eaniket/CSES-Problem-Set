#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
    int n, cnt = 0;
    
    cin>>n;
    vector<int> arr, eliminated(n, 0);
    for(int i=1;i<=n;i++){
        arr.push_back(i);
    }

	int current = 0;
    for(int i=0;i<n;i++){
    	int count = 0;
    	while(count < 2){
    		if(eliminated[current] == 0){
    			count++;
    		}
    		if(count < 2){
    			current = (current + 1)%n;
    		}
    		
    	}
    	eliminated[current] = 1;
    	cout<<arr[current]<<" ";
    }
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

