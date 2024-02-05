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
struct Node * DeleteFirstNode(struct Node *head){
    struct Node *ptr = head;
    head = ptr->next;
    free(ptr);

    return head;
}
struct Node * DeleteAtIndex(struct Node *head,int index){
    struct Node *p = head;
    struct Node *q = head -> next;
    for(int i=0;i<index-1;i++){
        p = p->next;
        q = q->next;
    }
    p->next = q->next;
    free(q);

    return head;
}
struct Node * DeleteAtLast(struct Node *head){
    struct Node *p = head;
    struct Node *q = head -> next;
    while(q->next != NULL){
        p = p ->next;
        q = q ->next;
    }
    p->next = NULL;
    free(q);

    return head;
}
struct Node * DeleteAtValue(struct Node *head,int value){
    struct Node *p = head;
    struct Node *q = head -> next;
    while(q->data != value && q->next != NULL){
        p = p->next;
        q = q->next;
    }
    if(q->data == value){
        p->next = q->next;
        free(q);
    }

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
    fourth->next = NULL;

    printf("linked list\n");
    TraverseLinkedList(head);
/*
    printf("Delete First Node\n");
    head = DeleteFirstNode(head);
    TraverseLinkedList(head);

    printf("Delete At Index\n");
    head = DeleteAtIndex(head,2);
    TraverseLinkedList(head);

    printf("Delete At Last Index\n");
    head = DeleteAtLast(head);
    TraverseLinkedList(head);
*/
    printf("Delete with the value\n");
    head = DeleteAtValue(head, 20);
    TraverseLinkedList(head);

    return 0;
}