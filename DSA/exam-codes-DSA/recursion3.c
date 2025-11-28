#include<stdio.h>

void fn(int n){
    if(n<1){
        return;
    }
    fn(n-1);
    fn(n-3);
    printf("%d",n);
}


int main(){
    fn(5);
    return 0;
}