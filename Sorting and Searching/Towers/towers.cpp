#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve(){
    int n, temp;
    set<int> st;
    cin>>n;
    for(int i=0;i<n;i++){
        cin >> temp;
        auto it = st.upper_bound(temp);
        if(it != st.end()){
            st.erase(it);
        }
        st.insert(temp);
    }
    cout<<st.size();
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