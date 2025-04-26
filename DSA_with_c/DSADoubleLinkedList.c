#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node * prev;
    struct Node * next;
};

struct Node * display(struct Node *head){
    while(head != NULL){
        printf("%d -> ",head ->data);
        head = head -> next;
    }
    printf("\n");

    return 0;
}

int main (){
    struct Node *n1 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *n2 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *n3 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *n4 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *n5 = (struct Node *)malloc(sizeof(struct Node));

    n1 -> data = 11;
    n1 -> next = n2;
    n1 -> prev = NULL;

    n2 -> data = 22;
    n2 -> next = n3;
    n2 -> prev = n1;

    n3 -> data = 33;
    n3 -> next = n4;
    n3 -> prev = n2;

    n4 -> data = 44;
    n4 -> next = n5;
    n4 -> prev = n3;

    n5 -> data = 55;
    n5 -> next = NULL;
    n5 -> prev = n4;

    printf("print the linked list:\n");
    display(n1);
    
    return 0;
}