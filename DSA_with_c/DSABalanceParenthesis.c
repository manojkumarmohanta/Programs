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
//function parenthesis match
int parenthesisMatch(char *exp){
    struct stack *sp;
    sp -> size = 80;
    sp -> top = -1;
    sp -> arr = (char *)malloc(sp -> size * sizeof(char));
    int popped_ch;
    for(int i=0; exp[i]!='\0'; i++){
        if(exp[i] == '(' || exp[i] == '{' || exp[i] == '['){
            Push(sp,exp[i]);
        }else if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']'){
            if(isEmpty(sp)){
                return 0;
            }else{
                popped_ch = Pop(sp);
                if(!match(popped_ch, exp[i])){
                    return 0;
                }

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
    char *exp = "(a+m)+{[a*m]-(a+b)}";
    if(parenthesisMatch(exp)){
        printf(" parenthesis are balanced");
    }else{
        printf("parenthesis are not balanced");
    }

    return 0;
}