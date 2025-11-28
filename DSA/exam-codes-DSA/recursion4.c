#include<stdio.h>
int arr[]={1,2,3,4,5,6};
void print_array(int arr[],int i, int j){
    if(i==j){
        printf("[%d]",arr[i]);
        return;
    }else{
        printf("[%d]",arr[i]);
        print_array(arr,i+1,j);
    }
}
int main(){print_array(arr,0,5);return 0;}
    
    
