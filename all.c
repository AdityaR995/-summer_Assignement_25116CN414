#include<stdio.h>
int main(){
    //finding the percentage 
    int a,b,c,d,e,perc;
    scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
    perc=(a+b+c+d+e)/500*100;
    printf("the average percenatge of all the subject is %d",perc);
    return 0;
}