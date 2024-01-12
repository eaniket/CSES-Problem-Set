#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
	ll n, sum;
	cin >> n;
	sum = (n+1)*n/2;
	if(sum%2){
		cout<<"NO";
		return;
	}
	
	cout<<"YES\n";
	if(n%2){
		cout<<n/2<<endl;
		for(int i=2;i<=n/2;i+=2){
			cout<<i<<" "<<n-i<<" ";
		}
		cout<<n<<endl<<(n+1)/2<<endl;
		for(int i=1;i<=n/2;i+=2){
			cout<<i<<" "<<n-i<<" ";
		}
	}else{
		cout<<n/2<<endl;
		for(int i=2;i<=n/2;i+=2){
			cout<<i<<" "<<n-i+1<<" ";
		}
		cout<<endl<<n/2<<endl;
		for(int i=1;i<=n/2;i+=2){
			cout<<i<<" "<<n-i+1<<" ";
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