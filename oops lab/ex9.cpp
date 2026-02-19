#include<iostream>
using namespace std;
class Sample 
{
    int a, b;
    public:
    void setData(int x, int y) 
    {
    a = x;
    b = y;
    }
    friend class Sum; 
    friend void display(Sample); 
};
class Sum 
{
    public:
    int add(Sample s) 
    {
    return s.a + s.b;
    }
};
void display(Sample s) 
{
    cout<<"Values: a ="<<s.a<< "b = " <<s.b<<endl;
}
int main() 
{
    Sample s;
    s.setData(10, 20);
    Sum obj;
    display(s);
    cout<<"Sum =" <<obj.add(s)<<endl;
    return 0;
}