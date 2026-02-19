#include<iostream>
using namespace std;
class Account{
    public:
    int accno;
    string name;
    float balance;
    void display()
    {
        cout<<"acc no:"<<accno
        <<",name:"<<name
        <<",Balance:"<<balance<<endl;

    }
};
int main()
{
    Account a1,a2;
    a1.accno=1001;
    a1.name="venkata";
    a1.balance=2400.1;
    a2.accno=2002;
    a2.name="sandeep";
    a2.balance=1050.16;
    a1.display();
    a2.display();
    return 0;
}