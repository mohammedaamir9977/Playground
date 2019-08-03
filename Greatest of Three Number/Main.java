#include <stdio.h>

int main()
{ 
  int first,second,third;
  scanf("%d , %d , %d",&first,&second,&third);
  if(first>second && first>third)
    printf("%d",first);
  else if (second>first && second>third)
    printf("%d",second);
  else
    printf("%d",third);
  return 0;
    // type your code here
}