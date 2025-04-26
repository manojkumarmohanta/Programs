#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
    struct Node *prev;
};
//create new node
struct Node * createNode(int data){
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode -> data = data;
    newNode -> next = NULL;
    newNode -> prev = NULL;

    return newNode;
}
//insert data
void insertData(struct Node **head, int data){
    struct Node *newNode = createNode(data);
    
    if(*head == NULL){
        *head = newNode;
    }else{
        newNode -> next = *head;
        (*head) -> prev = newNode;
        *head = newNode;
    }
}
//display data forward
void printForward(struct Node *head){
    while(head != NULL){
        printf("%d <-> ",head -> data);
        head =head -> next;
    }
    printf("\n");
}
//print data backward
void printBackward(struct Node *tail){
    while(tail != NULL){
        printf("%d <-> ",tail -> data);
        tail = tail -> prev;
    }
    printf("\n");
}
int main(){
    struct Node *head = NULL;

    printf("double Linked List :\n");
    insertData(&head,10);
    insertData(&head,11);
    insertData(&head,12);
    insertData(&head,13);

    printf("print forward\n");
    printForward(head);

    printf("\nprint Backward\n");
    struct Node *tail = head;
    while(tail -> next != NULL){
        tail = tail ->next;
    }
    printBackward(tail);

    return 0;
}