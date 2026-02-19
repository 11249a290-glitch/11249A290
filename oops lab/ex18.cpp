#include<iostream>
using namespace std;
template <class T>
class Calculator {
T num1, num2;
public:
Calculator(T n1, T n2) : num1(n1), num2(n2) {}
void display() {
cout<<"Sum =" <<num1 + num2 <<endl;
}
};
int main() {
Calculator<int>c1(10, 20);
Calculator<float> c2(2.5, 3.5);
c1.display();
c2.display();
return 0;
}