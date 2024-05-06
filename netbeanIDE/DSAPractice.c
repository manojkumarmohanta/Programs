#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};


struct Node * createNode(int data){
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode -> data = data;
    newNode -> next = NULL;

    return newNode;
}

void insertData(struct Node **head, int data){
    struct Node *newNode = createNode(data);
    
    if(*head == NULL){
        *head = newNode;
    }else{
        struct Node * temp = *head;
        while(temp ->next !=NULL){
            temp = temp -> next;
        }
        temp -> next = newNode;
    }
}

void printList(struct Node *head){
    while(head != NULL){
        printf("%d -> ",head -> data);
        head = head ->next;
    }
    printf("\n");
}


int main(){
    struct Node *head = NULL;

    printf("Single Linked List :\n");
    insertData(&head,10);
    insertData(&head,11);
    insertData(&head,12);
    insertData(&head,13);

    printf("Linked List\n");
    printList(head);

    return 0;
}