#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *createNode(int data)
{
    struct node *n;
    n = (struct node *)malloc(sizeof(struct node));
    n->data = data;
    n->left = NULL;
    n->right = NULL;
    return n;
}

void inOrder(struct node *root)
{
    if (root != NULL)
    {
        inOrder(root->left);
        printf("%d->", root->data);
        inOrder(root->right);
    }
}

int isBST(struct node *root)
{
    static struct node *prev = NULL;
    if (root == NULL)
    {
        if (!isBST(root->left))
        {
            return 0;
        }
        if (prev != NULL && root->data <= prev->data)
        {
            return 0;
        }
    }
    else
    {
        return 1;
    }
}

struct node *searchIter(struct node *root, int key)
{
    while (root != NULL)
    {
        if (key == root->data)
        {
            return root;
        }
        else if (key < root->data)
        {
            root = root->left;
        }
        else
        {
            root = root->right;
        }
    }

    return NULL;
}

void insert(struct node *root,int key){
    struct node *prev = NULL;
    while(root != NULL){
        prev = root;
        if(key == root->data){
            printf("can't insert %d, Already exist", key);
            return ;
        }else if(key < root->data){
            root = root->left;
        }else{
            root = root->right;
        }
    }
    struct node* new = createNode(key);

    if(key<prev->data){
        prev->left = new;
    }else{
        prev->right = new;
    }
}

struct node *inOrderPredecessor(struct node *root){
    root = root->left;
    while(root->right != NULL){
        root = root->right;
    }
    return root;
}

struct node *deletionNode(struct node *root, int value){
    struct node* ipre;
    if(root == NULL){
        return NULL;
    }

    if(root->left == NULL && root->right == NULL){
        free(root);
        return NULL;
    }

    if(value < root->data){
        root->left = deletionNode(root->left, value);
    }else if(value > root->data){
        root->right = deletionNode(root->right, value);
    }else{
        ipre = inOrderPredecessor(root);
        root->data = ipre->data;
        root->left = deletionNode(root->left,ipre->data);
    }
    return root;
}

int main()
{
    struct node *p = createNode(5);
    struct node *p1 = createNode(3);
    struct node *p2 = createNode(6);
    struct node *p3 = createNode(1);
    struct node *p4 = createNode(4);

    p->left = p1;
    p->right = p2;
    p1->left = p3;
    p1->right = p4;

    inOrder(p);
    deletionNode(p, 5);
    printf("\n");
    printf("%d", p->data);
    printf("\n");
    inOrder(p);

    return 0;
}