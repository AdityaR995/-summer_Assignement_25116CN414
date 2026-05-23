#include<stdio.h>
int main() {
    int y;
    printf("Enter a year: ");
    scanf("%d",&y);
    if (y%400==0||(y%4==0&&y%100!=0))
        printf("%d is a Leap Year",y);
    else
        printf("%dnot a Leap Year",y);
    return 0;
}