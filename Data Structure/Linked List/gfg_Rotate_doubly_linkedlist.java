struct node*update(struct node*start,int p)
{
    node* temp = start;
    node *t = start;
    
    if(temp == NULL || temp->next == NULL)
        return start;
    
    while(temp->next != NULL){
        temp = temp->next;
    }
    
    while(p-- >0){
        t = t->next;
        temp->next = t->prev;
        temp->next->next = NULL;
        temp = temp->next;
    }
    return t;
}
