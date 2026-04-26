#include<stdio.h>
struct item
{
    int profit;
    int weight;
    float ratio;//profit per weight ratio
};
 /* Function to sort items by ratio in descending order */ 
void sort(struct item items[],int n)
{
    struct item temp;
    for (int i=0;i<n-1;i++)
    {
        for (int j=0;j<n-i-1;j++)
        {
            if (items[j].ratio<items[j+1].ratio)
            {
                temp = items[j];
                items[j]=items[j+1];
                items[j+1]=temp;
            }
        }
    }
}
int main()
{
    int c,n;
    //caacity 
    printf("enter capacity:");
    scanf("%d",&c);
    //no.of items
     printf("enter no of items:");
     scanf("%d",&n);
     struct item itm[n];
     for(int i=0;i<n;i++)
     {
         //weights 
        printf("enter item %d weight profit:",i+1);
        scanf("%d" "%d",&itm[i].weight,&itm[i].profit);
        itm[i].ratio=(itm[i].profit)/(itm[i].weight);
     }
    /* Sort items by value/weight ratio */ 
     sort(itm,n);
     float totalProfit=0.0;
     for(int i=0;i<n;i++)
     {
         if (c >= itm[i].weight)
         {
             totalProfit += itm[i].profit;
             c -= itm[i].weight;
         }
         else
         {
             totalProfit += itm[i].ratio*c;
             break;
         }
     }
     printf("Maximum profit =%.2f\n",totalProfit);
    return 0;
}
