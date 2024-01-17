#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	long n;
	cin >> n;
	vector<string> vec;

	if(n == 0){
		cout<<"0";
		return; 
	}
	vec.push_back("0");
	vec.push_back("1");
	for(int i=2;i<=n;i++){
		int temp = vec.size();
		for(int j=temp;j>0;j--){
			vec.push_back(vec[j-1]);
		}
		for(int j=0;j<temp;j++){
			vec[j] = "0"+vec[j];
		}
		for(int j = temp; j < 2*temp; j++){
			vec[j] = "1"+vec[j];
		}
	}

	for(int i=0;i<vec.size();i++){
		cout<<vec[i]<<endl;
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