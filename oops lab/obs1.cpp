#include &lt;iostream&gt;
using namespace std;
class Laptop {
public:
string brand;
string processor;
int ram;
void display() {
cout &lt;&lt; &quot;Brand: &quot; &lt;&lt; brand
&lt;&lt; &quot;, Processor: &quot; &lt;&lt; processor
&lt;&lt; &quot;, RAM: &quot; &lt;&lt; ram &lt;&lt; &quot;GB&quot; &lt;&lt; endl;
}
};
int main() {
Laptop l1, l2;
l1.brand = &quot;Dell&quot;;
l1.processor = &quot;Intel i5&quot;;
l1.ram = 8;
l2.brand = &quot;HP&quot;;
l2.processor = &quot;AMD Ryzen 5&quot;;
l2.ram = 16;
l1.display();
l2.display();
return 0;
}