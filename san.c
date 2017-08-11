

#include<stdio.h>
#include<string.h>

int main() {
   char str[100], temp;
   int a, j = 0;

   printf("\nEnter the string :");
   gets(str);

   a = 0;
   j = strlen(str) - 1;

   while (a < j) {
      temp = str[a];
      str[a] = str[j];
      str[j] = temp;
      a++;
      j--;
   }

   printf("\nReverse string is :%s", str);
   return (0);
