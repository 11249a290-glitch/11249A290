#include<graphics.h>
#include<conio.h>
int main() {
int gd = DETECT, gm;
initgraph(&gd, &gm, "");
circle(200, 200, 50);

rectangle(150, 150, 250, 250);
line(100, 300, 300, 300);
getch();
closegraph();
return 0;
}