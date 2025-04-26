#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *next;
};
void TraverseLinkedList(struct Node * head){
    struct Node * ptr = head;
    do{
        printf("%d -> ",ptr->data);
        ptr = ptr -> next;
    }while(ptr != head);
}
struct Node * InsertAtFirst(struct Node * head, int value){
    struct Node * ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node * p = head;
    ptr->data = value;

    while(p->next != head){
        p = p -> next;
    }

    p->next = ptr;
    ptr->next = head;
    head = ptr;

    return head;


}

int main(){
    struct Node *head = (struct Node *)malloc(sizeof(struct Node));
    struct Node *second = (struct Node *)malloc(sizeof(struct Node));
    struct Node *third = (struct Node *)malloc(sizeof(struct Node));
    struct Node *fourth = (struct Node *)malloc(sizeof(struct Node));

    head->data = 7;
    head->next = second;

    second->data = 11;
    second->next = third;

    third->data = 20;
    third->next = fourth;

    fourth->data = 41;
    fourth->next = head;

    printf("Circular Linked list\n");
    TraverseLinkedList(head);

    printf("\nCircular Linked List Insertion At First\n");
    head = InsertAtFirst(head, 15);
    TraverseLinkedList(head);

    return 0;
}