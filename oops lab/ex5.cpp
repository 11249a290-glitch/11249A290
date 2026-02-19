#include<iostream>
using namespace std;
class sample
{
    int x,y;
    public:
    sample()
    {
        x=0;
        y=0;
        cout<<"default constuctor called"<<endl;
        
    }
    sample(int a, int b)
        {
            x=a;
            y=b;
            cout<<"parameterized constuctor called"<<endl;
        }
    sample(const sample & s)
    {
        x=s.x;
        y=s.y;
        cout<<"copy constuctor called "<<endl;
    }
    void display()
    {
        cout<<"x="<<x<<"y="<<y<<endl;
    }
    ~sample()
    {
        cout<<"destructor called for objects"<<endl;
    }
};
int main()
{
    sample s1;
    sample s2(10,20);
    sample s3=s2;
    s1.display();
    s2.display();
    s3.display();
    return 0;
}