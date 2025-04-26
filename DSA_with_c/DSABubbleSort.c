#include <stdio.h>
#include <stdlib.h>

void printArray(int* A, int n){
    for(int i=0; i<n; i++){
        printf("%d ", A[i]);
    }
    printf("\n");
}

void bubbleSort(int *A, int n){
    int temp;
    int isSorted;
    for(int i=0; i<n-1; i++){
        printf("working in pass %d\n", i+1);
        isSorted = 1;
        for(int j=0; j<n-i-1; j++){
            if(A[j] > A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
                isSorted = 0;
            }
        }
        if(isSorted){
            return;
        }
    }
}

int main(){
    int A[] = {1,2,3,4,5,6,7};
    int n = 7;

    printArray(A,n);
    bubbleSort(A,n);
    printArray(A,n);
    return 0;
}