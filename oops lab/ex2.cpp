#include<iostream>
using namespace std;
class rectangle
{
    int length,breadth;
    public:
    void setdata(int l,int b);
    void area()
    {
        cout<<"area:"<<length*breadth<<endl;
    }
};
void rectangle::setdata(int l,int b)
{
    length=l;
    breadth=b;
}
int main()
{
    rectangle r1;
    r1.setdata(10,5);
    r1.area();
    return 0;
}