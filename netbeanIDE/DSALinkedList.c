#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

void TraverseLinkedList(struct Node *ptr){
    while (ptr != NULL) {
        printf("%d -> ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}

void display(struct Node *ptr){
    while (ptr != NULL) {
        printf("%d -> ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n"); 
}
int main(){
    // tester
    struct Node *head = (struct Node *)malloc(sizeof(struct Node));
    struct Node *second = (struct Node *)malloc(sizeof(struct Node));
    struct Node *third = (struct Node *)malloc(sizeof(struct Node));
    struct Node *fourth = (struct Node *)malloc(sizeof(struct Node));
    
    head -> data = 7;
    head -> next = second;

    second -> data = 11;
    second -> next = third;

    third -> data = 20;
    third -> next = fourth;

    fourth -> data = 41;
    fourth -> next = NULL;

    printf("First Linked List\n");
    TraverseLinkedList(head);

    // my hand written 
    struct Node *num1 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num2 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num3 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num4 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num5 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num6 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num7 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num8 = (struct Node *)malloc(sizeof(struct Node));
    struct Node *num9 = (struct Node *)malloc(sizeof(struct Node));

    num1 -> data = 10;
    num1 -> next = num2;

    num2 -> data = 20;
    num2 -> next = num3;

    num3 -> data = 30;
    num3 -> next = num4;

    num4 -> data = 40;
    num4 -> next = num5;

    num5 -> data = 50;
    num5 -> next = num6;

    num6 -> data = 60;
    num6 -> next = num7;

    num7 -> data = 70;
    num7 -> next = num8;

    num8 -> data = 80;
    num8 -> next = num9;

    num9 -> data = 90;
    num9 -> next = NULL;

    printf("Second Linked List \n");
    display(num1);
   return 0;
}