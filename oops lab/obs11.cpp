#include &lt;iostream&gt;
using namespace std;
// declare a class
class Wall {
private:
double length;
double height;
public:
// parameterized constructor to initialize variables
Wall(double len, double hgt)
: length{len}
, height{hgt} {
}
double calculateArea() {
return length * height;
}
};
int main() {
// create object and initialize data members
Wall wall1(10.5, 8.6);
Wall wall2(8.5, 6.3);
cout &lt;&lt; &quot;Area of Wall 1: &quot; &lt;&lt; wall1.calculateArea() &lt;&lt; endl;
cout &lt;&lt; &quot;Area of Wall 2: &quot; &lt;&lt; wall2.calculateArea();
return 0;
}