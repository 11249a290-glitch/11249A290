#include<iostream>
using namespace std;
class MathOperations 
{
public:
void add(int a, int b) 
{
    cout<<"sum="<<a+b<<endl;
}
void add(double a,double b)
{
    cout<<"sum="<<a+b<<endl;
}
void add(int a,int b,int c)
{
    cout<<"sum="<<a+b+c<<endl;
}
};
int main()
{
    MathOperations m;
    m.add(3.5,5.9);
    m.add(1,2,3);
    return 0;
}