#include<iostream>

using namespace std;
class Sample {
int x;
public:
void setValue(int x) {
this->x = x;
}
inline void display() {
cout<<"Value of x = "<< x<< endl;
}
};
int main() {
Sample s;
s.setValue(25);
s.display();
return 0;
}