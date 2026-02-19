#include<iostream>
using namespace std;
class Book
{
    public:
    int price;
    string author;
    string name;
    void display()
    {
        cout<<",price:"<<price
        <<",author:"<<author
        <<",name:"<<name<<endl;
    }
};
int main()
{
    Book book1,book2;
    book1.price=10;
    book1.author="sandeep";
    book1.name="code in c";
    book2.price=10;
    book2.author="sandeep";
    book2.name="code in c++";
    book1.display();
    book2.display();
    return 0;
}