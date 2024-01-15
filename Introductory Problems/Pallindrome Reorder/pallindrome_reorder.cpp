#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	string s;
	cin >> s;
	vector<int> cnt(26, 0);
	for(int i=0; i<s.size(); i++){
		cnt[s[i]-'A']++;
	}
	int fl = 0;
	for(int i=0;i<26;i++){
		if(cnt[i]%2) {
			fl++;
		}
	}
	if(fl > 1){
		cout<< "NO SOLUTION";
		return;
	}else{
		int p=0;
		for(int i=0;i<26;i++){
			while(cnt[i] != 0){
				if(cnt[i] == 1){
					s[s.size()/2] = 'A'+i;
					cnt[i]--;
				}else{
					s[p] = 'A'+i;
					s[s.size()-p-1] = 'A'+i;
					cnt[i] -= 2;
					p++;
				}
			}
		}
		cout<<s;
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