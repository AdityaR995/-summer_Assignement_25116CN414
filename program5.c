#include<stdio.h>
int main(){
    float a,b;
    scanf("%f%f",&a,&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("value of swaped variables are %f%f",a,b);
    return 0;
}