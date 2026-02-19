#include<iostream>
using namespace std;
class employee{
    int id;
    string name;
    float salary;
    public:
    employee(){
        id=101;
        name="subramanain";
        salary=500000;
    }
    void display(){
        cout<<"Employee ID:"<<id<<endl;
        cout<<"Employee Name:"<<name<<endl;
        cout<<"Employee salary:"<<salary<<endl;
  }    
};
int main (){
    employee emp;
    cout<<"employee details using defult constuctor:"<<endl;
    emp.display();
return 0;
    }