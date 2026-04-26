#include<stdio.h>
//firstfit
void firstfit(int items[],int n,int c)
{
 // Available capacity of bins
int bin[n];
//Set binCount = 0 (no bins used ini ally)
int bincount=0;
 // Initialize all bins with full capacity
for(int i=0;i<n;i++)
bin[i]=c;
 // Process each item
for(int i=0;i<n;i++)
 {
    int placed=0;
    // Check existing bins
    for(int j=0;j<bincount;j++)
     {
      // items fits in the current bin 
        if(bin[j]>=items[i])
         {
            bin[j]-=items[i];
            printf("item %d placed in b8in %d\n",items[i],j+1);
            placed=1;
            break;
         }
     }
  // Create new bin if item is not fitted in any existing bin
    if (!placed)
    {
        bin[bincount]-=items[i];
        //Display the bin placement
        printf("item %d placed in bin %d\n",items[i],bincount+1);
        bincount++;
        
     }
 }
printf("total bins used =%d\n");
}
}
int main()
{
    int n,c;
   //Read the number of items 
    printf("enter number of items: ");
    scanf("%d",&n);
    int items[n];
   //Read the size of each item
    printf("enter item size:\n");
    for(int i=0;i<n;i++)
    {
      printf("item %d:",i+1);
      scanf("%d",&items[i]); 
    }
    //ead the bin capacity 
    printf("enter bin capacity: ");
    scanf("%d",&c);
//function call
    firstfit(items,n,c);    
    return 0;
}
