#include<iostream>
using namespace std;
class simple{
    public:
void show (){
        cout<<"object is working "<<endl;
 }
    ~simple(){
        cout<<"destructor called.objrct destroyed"<<endl;
  }
};
int main(){
    cout<<"creating object obj1..."<<endl;
    simple obj1;
    obj1.show ();
    cout<<"creating object obj2..."<<endl;
    simple obj2;
    obj2.show ();
     cout<<"End of program,objects will be destroyed automatically"<<endl;
     return 0;
}