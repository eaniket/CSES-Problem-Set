#include<bits/stdc++.h>
using namespace std;
#define ll long long int

vector<vector<int>> ans;
void move(int src, int dest){
	vector<int> temp;
	temp.push_back(src);
	temp.push_back(dest);
	ans.push_back(temp);
	return;
}
void towerOfHanoi(int n, int src, int dest, int helper){
	if(n == 1){
		move(src, dest);
		return;
	}
	towerOfHanoi(n-1, src, helper, dest);
	move(src, dest);
	towerOfHanoi(n-1, helper, dest, src);

}
void solve(){
	long n;
	cin >> n;
	towerOfHanoi(n, 1, 3, 2);
	cout<<ans.size()<<endl;
	for(int i=0;i<ans.size();i++){
		cout<<ans[i][0]<<" "<<ans[i][1]<<endl;
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