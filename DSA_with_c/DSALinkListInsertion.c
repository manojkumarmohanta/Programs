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
struct Node * insertFirst(struct Node *head, int data){
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data=data;
    ptr->next=head;

}
struct Node * insertAtPosition(struct Node *head, int data, int index){
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node *p = head;
    int i = 0;
    while(i!=index-1){
        p = p->next;
        i++;
    }
    ptr->data=data;
    ptr->next = p->next;
    p->next = ptr;
    
    return head;
}
struct Node * insertAtEnd(struct Node *head, int data){
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node *p = head;
    ptr->data=data;
    while(p->next!=NULL){
        p = p->next;
    }
    p->next = ptr;
    ptr->next = NULL;
    
    return head;
}
struct Node * insertAtAfterNode(struct Node *head,struct Node *prevNode, int data){
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node *p = head;
    ptr->data=data;
    ptr->next = prevNode->next;
    prevNode->next = ptr;
    
    return head;
}
int main()
{
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

    printf("First Linked List\n");
    TraverseLinkedList(head);

    printf("Insert At First\n");
    head = insertFirst(head,88);
    TraverseLinkedList(head);

    printf("Insert At middle\n");
    head = insertAtPosition(head,45,2);
    TraverseLinkedList(head);

    printf("Insert At last\n");
    head = insertAtEnd(head,29);
    TraverseLinkedList(head);

    printf("Insert At after a address\n");
    head = insertAtAfterNode(head,second,55);
    TraverseLinkedList(head);

    return 0;
}