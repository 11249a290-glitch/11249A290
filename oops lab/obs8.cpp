#include<iostream>
using namespace std;
class Person
{
    private:
    int age;
    public:
    person()
    {
        age=20;
    }
    person(int a)
    {
        age=3;
        }
        int getAge()
        {
            return age;
            }
};
int main()
{
    Person person1,Person2(20);
    cout<<"Person1 Age="<<person1.getAge()<<endl;
    cout<<"Person2 Age="<<Person2.getAge()<<endl;
    return 0;
}
