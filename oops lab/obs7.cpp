#include<iostream>
using namespace std;
class patient
{
    public:
    int patientID;
    string name;
    string Disease;
    void setpatient(int id,string n,string D)
    {
        patientID=id;
        name=n;
        Disease=D;
    }
    void show patient();
};
void patient::show patient()
{
    cout<<"patient id:"<<patientID<<",name:"<<name<<",Disease:"<<Disease<<endl;
}
int main()
{
    patient p1,p2;
    p1.setpatient(0,"venkat","cough");
    p2.setpatient(1,"sandeep","cold");
    p1.show patient();
    p2.show patient();
    return 0;
}