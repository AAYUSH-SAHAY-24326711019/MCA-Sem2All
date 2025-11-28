#include<stdio.h>


int fn(int n){
    if(n<3){
        return 1;
    }else{
        return (fn(n-1)+fn(n-1)+1);
    }
}

int main(){
    int k =fn(5);
    printf("%d",k);
    return 0;
}