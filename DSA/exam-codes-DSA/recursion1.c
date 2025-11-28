#include<stdio.h>

void fn(int x){
    if(x>0){
        printf("->[%d]\n",x);
        fn(x-1);
        printf("->[%d]\n",x);
        fn(x-1);
        printf("->[%d]\n",x);
    }
}



int main(){
    fn(3);
    return 0;
}