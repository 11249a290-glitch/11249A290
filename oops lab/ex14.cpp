#include<iostream>
using namespace std;
class Base1 {
protected:
int a;
public:
void getA() {
cout<<"Enter value of a:";
cin>> a;
}
};
class Base2 {
protected:
int b;
public:
void getB() {
cout<<"Enter value of b:";
cin>> b;
}
};
class Derived : public Base1, public Base2 {
public:
void sum() {
cout<<"Sum = "<<a + b<< endl;
}
};
int main() {
Derived d;
d.getA();
d.getB();
d.sum();
return 0;
}