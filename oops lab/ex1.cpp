#include<iostream>
using namespace std;
class student
{
    public:
    string name;
    int rollno;
    void display()
    {
        cout<<"name:"<<name
            <<"roll no:"<<rollno<<endl;
    }
};
int main()
{
    student s1;
    s1.name="john";
    s1.rollno=101;
    cout<<"student details";
    s1.display();
    return 0;
}