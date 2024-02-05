#include <stdio.h>
#include <stdlib.h>

//stack declaration
struct stack
{
    int size;
    int top;
    int *arr;
};
//is empty function
int isEmpty(struct stack *ptr)
{
    if (ptr->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
//is full function
int isFull(struct stack *ptr)
{
    if (ptr->top == ptr->size - 1)
    {
        return 1;
    }
    return 0;
}
//push function
void Push(struct stack *ptr, int val){
    if(isFull(ptr)){
        printf("Stack is Full , cannot push the value %d\n",val);
    }else{
        ptr->top++;
        ptr->arr[ptr->top] = val;
        printf("Push %d \n",val);
    }
}
//pop function
int Pop(struct stack *ptr){
    if(isEmpty(ptr)){
        printf("Stack is Empty\n");
        return -1;
    }else{
        
        return ptr->arr[ptr->top--];
    }
}
//peek to the stack
int peek(struct stack *ptr, int i){
    int index = ptr -> top - i + 1 ;
    if(index < 0){
        printf("invalid position");
        return -1;
    }else{
        return ptr -> arr[index];
    }
}
//main function
int main()
{

    struct stack *s = (struct stack *)malloc(sizeof(struct stack));
    if (s == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;  // Return non-zero to indicate failure
    }
    s->size = 10;
    s->top = -1;
    s->arr = (int *)malloc(s->size * sizeof(int));
    if (s->arr == NULL)
    {
        printf("Memory allocation for array failed\n");
        free(s);  // Free previously allocated memory for struct
        return 1;  // Return non-zero to indicate failure
    }
    printf("Memory allocation successful\n");
    //manually push
    // s -> arr[0] = 8;
    // s -> top++;
    // value pushing
    Push(s,12);
    Push(s,13);
    Push(s,14);
    Push(s,15);
    Push(s,16);
    Push(s,17);
    Push(s,18);
    Push(s,19);
    Push(s,20);
    Push(s,21);
    Push(s,22);
    // value poped
    printf("poped %d \n",Pop(s));
    printf("poped %d \n",Pop(s));
    printf("poped %d \n",Pop(s));

    //values of the stack
    // for(int j=1; j <= s -> top + 1;j++){
    //     printf("value at position %d is %d \n",j,peek(s,j));
    // }

    //value at position 5 
    printf("value is :%d \n",peek(s,5));

    free(s->arr);
    free(s);
    return 0;
}