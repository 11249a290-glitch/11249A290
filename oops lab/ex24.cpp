#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main() {
vector<int>v = {5, 2, 8, 1, 3};
sort(v.begin(), v.end());
cout<<"Sorted Vector:";
for (int x : v)
cout <<x <<" ";
cout<< endl;
cout<<"Max Element:" <<*max_element(v.begin(), v.end()) <<endl;
return 0;
}