#include<iostream>
using namespace std;
class Student
{
    public:
    string name;
    int rollNo;
    float marks;
    void display()
    {cout<<"Name:"<<name
    <<",Roll No:"<<rollNo
    <<",Marks:"<<marks<<endl;
    } 
};
int main(){
    Student s1,s2,s3;
    s1.name="sandeep";
    s1.rollNo=290;
    s1.marks=90.6;
    s2.name="venkat";
    s2.rollNo=190;
    s2.marks=80.6;
    s3.name="kumar";
    s3.rollNo=90;
    s3.marks=70.6;
    s1.display();
    s2.display();
    s3.display();
    return 0;
}