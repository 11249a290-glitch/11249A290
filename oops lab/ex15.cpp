#include<iostream>
using namespace std;
class Base {
protected:
int a;
public:
void getA() {
cout<<"Enter a:";
cin>>a;
}
};
class Intermediate : public Base {
protected:
int b;
public:
void getB() {
cout<<"Enter b:";
cin>>b;
}
};
class Derived : public Intermediate {
public:
void display() {
cout<<"Sum = "<<a + b <<endl;
}
};
int main() {
Derived obj;
obj.getA();
obj.getB();
obj.display();
return 0;
}