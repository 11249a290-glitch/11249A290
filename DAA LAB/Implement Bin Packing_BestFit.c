#include <stdio.h>
//bestfit
void bestFit(int items[], int n, int capacity)
{
    printf("\nBest Fit Algorithm\n");
    int bin[n];
    int binCount = 0;
    // Initialize bins with full capacity(while adding the items this will be updated to reflect available capacity)
    for (int i = 0; i < n; i++)
        bin[i] = capacity;
    // Process each item
    for (int i = 0; i < n; i++)
    {
        int bestIndex = -1;
        int minSpace = capacity + 1;
        // Find bin with least remaining space after placement
        for (int j = 0; j < binCount; j++)
        {
            if (bin[j] >= items[i] && (bin[j] - items[i]) < minSpace)
            {
                bestIndex = j;
                minSpace = bin[j] - items[i];
            }
        }
        //After scanning all bins,Identified the best bin for the current item 
        if (bestIndex != -1)
        {
            bin[bestIndex] -= items[i];
            printf("Item %d (weight %d)  placed in Bin %d\n", i+1,items[i], bestIndex + 1);
        }
            // New bin needed 
        else
        {
            bin[binCount] -= items[i];
            printf("Item %d (weight %d) placed in Bin %d\n", i+1, items[i], binCount + 1);
            binCount++;
        }
    }
    printf("Total bins used = %d\n", binCount);
}
int main()
{
    int n, capacity;
    //read the number of items 
    printf("Enter number of items: ");
    scanf("%d", &n);
     /* Define an array to hold item sizes 
        1. Only after we know the number of items or 
        2. Define a large array and waste memory or 
        3. Use dynamic allocation 
        if this is not taken care then random values will be in the array 
      */ 
       int items[n];
      //Read the bin capacity C. 
      printf("Enter bin capacity: ");
    scanf("%d", &capacity);   
     //Read the size of each item
    printf("Enter item sizes:\n");
    for (int i = 0; i < n; i++)
   {
       int itemSize; 
        printf("Item %d: ", i + 1);
        scanf("%d", &itemSize);
        if (itemSize <=capacity)
        {
            items[i]=itemSize;
        }
        else
        {
            printf("item size exceeds bin capcity. please enter a valid size.\n");
            i--;
        }
    }
    //function call
    bestFit(items, n, capacity);
    return 0;
}
