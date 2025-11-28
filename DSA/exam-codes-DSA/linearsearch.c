#include<stdio.h>

int linearSearch(int arr[],int size,int target){
    for(int i = 0; i<size; i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}

int main(){
    int arr[] = {10,20,30};
    int size = sizeof(arr)/sizeof(int);
    printf("Found at index :%d",linearSearch(arr,size,30));
    return 0;
}