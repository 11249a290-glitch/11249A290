#include <stdio.h>
int fib(int n)
{
//default conditions
/* Base Condition: If n is 0 or 1, the term is the value itself[cite: 141]. 
 */
if(n==0)
return 0;
if(n==1)
return 1;
//to print the nth fibonacci term
  /* * Recursive Step: F(n) = F(n-1) + F(n-2)[cite: 142]. 
    * Note: This causes the function to branch twice for every call, 
    * leading to the exponential time complexity observed in DAA. 
    */ 
return fib(n-1)+fib(n-2);
}
int main()
{
int n;
  // Step 1: Read the input n
printf("enter number: ");
scanf("%d",&n);
 /* Checking if input is a valid integer and non-negative. */ 
if (n < 0) {
printf("invalid");
}
 //function call
fib(n);
printf("fibonacci term is: %d", fib(n));
return 0;
}
