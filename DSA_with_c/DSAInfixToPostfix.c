#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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
//top value of the stack
char stackTop(struct stack* sp){
    return sp -> arr[sp -> top];
}
//match top vale and popped value
int match(char a, char b){
    if((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}')){
        return 1;
    }
    return 0;
}

int precedence(char ch){
    if(ch == '*' || ch == '/'){
        return 3;
    }else if(ch == '+' || ch == '-'){
        return 2;
    }else{
        return 0;
    }
}

char isOperator(char ch){
    if(ch == '*' || ch == '/' || ch == '+' || ch == '-'){
        return 1;
    }else{
        return 0;
    }
}

char * infixToPostfix(char* infix){
    struct stack * sp = (struct stack *) malloc(sizeof(struct stack));
    sp -> size =100;
    sp -> top = -1;
    sp -> arr = (char *) malloc(sp -> size * sizeof(char));

    char * postfix = (char *) malloc((strlen(infix)+1) * sizeof(char));

    int i=0;
    int j=0;

    while(infix[i] != '\0'){
        if(!isOperator(infix[i])){
            postfix[j] = infix[i];

            j++;
            i++;
        }else{
            if(precedence(infix[i]) > precedence(stackTop(sp))){
                Push(sp, infix[i]);
                i++;
            }else{
                postfix[j] = Pop(sp);
                j++;
            }
        }
    }

    while (!isEmpty(sp))
    {
        postfix[j] = Pop(sp);
        j++;
    }
    postfix[j] = '\0';
    return postfix;
    

}

int main(){
    char * infix = "a-b+c/6";
    printf("postfix is %s ", infixToPostfix(infix));

    return 0;
}