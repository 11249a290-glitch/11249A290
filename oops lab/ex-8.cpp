#include<iostream>
using namespace std;
int main() 
{
int *ptr = new int;
*ptr = 25;
cout<<"Value of dynamically allocated integer:"<<*ptr<<endl;
delete ptr; 
int n;
cout<<"Enter number of elements:";
cin>>n;
int *arr = new int[n];
cout<<"Enter"<<n<<"elements:";
for (int i = 0; i<n; i++)
cin>>arr[i];
cout<<"You entered:";
for (int i = 0; i<n; i++)
cout<<arr[i]<<"";
delete[]arr;
return 0;
}