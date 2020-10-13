class Node
{
    int data;
    Node left, right;
   Node(int item)    
   {
        data = item;
        left = right = null;
    }
} */
class Tree
{
    Node makeMirror(Node node){
        if(node == null)
	        return node;
	        
	    Node Left = makeMirror(node.left);
	    Node Right = makeMirror(node.right);
	    
	    node.right = Left;
	    node.left = Right;
	    
	    return node;
    }
    void mirror(Node node)
    {
	    makeMirror(node);
    }
}
