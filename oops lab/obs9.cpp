#include<iostream>
using namespace std;
class Wall
{
private:
double length(5.5);
public:
Wall()=default;
void print_length()
{
    cout<<"length="<<length<<endl;
}
};
int main()
{
    Wall wall1;
    wall1.print_length();
    return 0;
}