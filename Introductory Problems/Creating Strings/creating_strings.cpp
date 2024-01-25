#include<bits/stdc++.h>
using namespace std;
#define ll long long int

vector<string> ans;

void helper(string s, int idx, int n){
	if(idx == n){
		ans.push_back(s);
		return;
	}
	unordered_set<char> st;
	for(int i=idx;i<n;i++){
		if(st.find(s[i]) != st.end()) continue;
		st.insert(s[i]);
		swap(s[idx], s[i]);
		helper(s, idx+1, n);
		swap(s[idx], s[i]);
	}
	return;
}

void solve(){
	string s;
	cin >> s;
	int n = s.size();

	helper(s, 0, n);
	sort(ans.begin(), ans.end());

	cout<<ans.size()<<endl;
	for(int i=0;i<ans.size();i++){
		cout<<ans[i]<<endl;
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