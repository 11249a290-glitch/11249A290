#include<iostream>
#include<fstream>
using namespace std;
int main() {
ofstream fout("data.txt");
fout <<"Hello, File Handling in C++!";
fout.close();
ifstream fin("data.txt");
string text;
getline(fin, text);
cout<<"File Content:" <<text<<endl;
fin.close();
return 0;
}