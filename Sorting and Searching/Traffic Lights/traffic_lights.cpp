#include<bits/stdc++.h>
using namespace std;
#define ll long long int


int main(){
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    
	int n, q, temp;
	cin>>n>>q;
	set<int> st;
	multiset<int> lengths;
	st.insert(0);
	st.insert(n);
	lengths.insert(n);
	for(int i=0;i<q;i++){
		cin >> temp;
		st.insert(temp);


		auto it = st.find(temp);
		int prev_val = *prev(it);
		int next_val = *next(it);

		// auto tempItr = lengths.find(next_val - prev_val);
		lengths.erase(lengths.find(next_val - prev_val));
		lengths.insert(next_val - temp);
		lengths.insert(temp - prev_val);

		cout<<*lengths.rbegin()<<" ";
	}
	return 0;
}