#include <stdio.h>
#include <stdlib.h>

//stack declaration
struct stack
{
    int size;
    int top;
    char *arr;
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
void Push(struct stack *ptr, char val){
    if(isFull(ptr)){
        printf("Stack is Full , cannot push the value %d\n",val);
    }else{
        ptr->top++;
        ptr->arr[ptr->top] = val;
    }
}
//pop function
char Pop(struct stack *ptr){
    if(isEmpty(ptr)){
        printf("Stack is Empty\n");
        return -1;
    }else{
        char val = ptr -> arr[ptr->top];
        ptr ->top--;

        return val;
    }
}
//function parenthesis match
int parenthesisMatch(char *exp){
    struct stack *sp;
    sp -> size = 80;
    sp -> top = -1;
    sp -> arr = (char *)malloc(sp -> size * sizeof(char));

    for(int i=0; exp[i]!='\0'; i++){
        if(exp[i] == '('){
            Push(sp,'(');
        }else if(exp[i] == ')'){
            if(isEmpty(sp)){
                return 0;
            }else{
                Pop(sp);
            }
        }
    }
    if(isEmpty(sp)){
        return 1;
    }else{
        return 0;
    }
    
}
int main(){
    char *exp = "8*(9)";
    if(parenthesisMatch(exp)){
        printf("parenthesis matched");
    }else{
        printf("parenthesis not matched");
    }

    return 0;
}