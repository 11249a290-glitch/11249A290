#include<iostream>
using namespace std;
class Student 
{
int roll;
string name;
public:
void getData() 
{
cout<<"Enter Roll No and Name:";
cin>>roll>>name;
}
void display() 
{
cout<<"Roll No:"<<roll<<"Name:"<<name<<endl;
}
};
int main() 
{
Student s[3];
for (int i = 0; i<3; i++) 
{
cout<<"Enter details for Student:"<<i + 1 <<endl;
s[i].getData();
}
cout<<"\nStudent Details:\n";
for (int i = 0; i<3; i++)
s[i].display();
return 0;
}