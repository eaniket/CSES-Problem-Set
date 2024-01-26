#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	int n, m, k, ans = 0;
	ll temp, temp2 = 0;
    cin>>n>>m>>k;
    vector<pair<ll, ll>> req;
    vector<ll> apts;
    for(int i=0;i<n;i++){
    	cin>>temp;
    	temp2 = (temp < k) ? 0 : temp-k;
    	req.push_back(make_pair(temp2, temp+k));
    }
    for(int i=0;i<m;i++){
    	cin>>temp;
    	apts.push_back(temp);
    }
    sort(req.begin(), req.end());
    sort(apts.begin(), apts.end());


    int ptr=0;
    for(int i=0;i<m && ptr<n;){
    	if(req[ptr].first <=apts[i] && req[ptr].second >= apts[i]){
    		ans++;
    		ptr++;
    		i++;
    	}else if(req[ptr].second < apts[i]){
    		ptr++;
    	}else if(req[ptr].first > apts[i]){
    		i++;
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