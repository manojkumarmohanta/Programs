#include<stdio.h>
#include<stdlib.h>

struct CircularQueue{
    int size;
    int f;
    int r;
    int* arr;

};

int isEmpty(struct CircularQueue *q){
    if(q -> r == q -> f){
        return 1;
    }
    return 0;
}

int isFull(struct CircularQueue *q){
    if((q -> r+1)% q -> size == q -> f){
        return 1;
    }
    return 0;
}

void enqueue(struct CircularQueue *q, int val){
    if(isFull(q)){
        printf("This queue is full");
    }else{
        q -> r = (q -> r + 1) % q -> size;
        q -> arr[q->r]= val;
        printf("enqueue element: %d\n", val);
    }
}

int dequeue(struct CircularQueue *q){
    int a = -1;
    if(isEmpty(q)){
        printf("This queue is Empty");
    }else{
        q -> f = (q -> f + 1) % q ->size;
        a = q -> arr[q->f];
    }
    return a;
}

int main(){

    struct CircularQueue q;
    q.size = 4;
    q.f = q.r = 0;
    q.arr = (int*)malloc(q.size * sizeof(int));


    enqueue(&q,12);
    enqueue(&q,15);
    enqueue(&q,25);

    printf("dequeue the element %d \n", dequeue(&q));
    printf("dequeue the element %d \n", dequeue(&q));
    printf("dequeue the element %d \n", dequeue(&q));

    enqueue(&q,11);
    enqueue(&q,10);
    enqueue(&q,16);


    if(isEmpty(&q)){
        printf("Queue is empty");
    }
    if(isFull(&q)){
        printf("Queue is full");
    }

    return 0;
}