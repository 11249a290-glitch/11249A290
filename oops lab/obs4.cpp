#include<iostream>
using namespace std;
class Car
{
    public:
    int model;
    string company;
    int price;
    void display()
    {
        cout<<"model:"<<model
        <<",company:"<<company
        <<",price:"<<price<<endl;
    }
};
int main()
{
    Car car1,car2,car3;
    car1.model=0001;
    car1.company="pvs";
    car1.price=100000;
    car2.model=0002;
    car2.company="pvs";
    car2.price=200000;
    car3.model=0003;
    car3.company="pvs";
    car3.price=300000;
    car1.display();
    car2.display();
    car3.display();
    return 0;
}