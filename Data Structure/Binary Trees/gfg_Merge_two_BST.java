class Node{
	int data;
	Node left, right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
    public static void convertInorder(Node root, List<Integer>l){
        if(root == null)
            return;
            
        convertInorder(root.left, l);
        
        l.add(root.data);
        
        convertInorder(root.right, l);
        
    }
    
    public static int countNodes(Node root){
        if(root == null)
            return 0;
            
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
	public static void merge(Node root1 , Node root2)
    {   
        List<Integer> l = new ArrayList<>();
        convertInorder(root1, l);
        convertInorder(root2, l);
        
        Collections.sort(l);
        
        Iterator<Integer> list = l.iterator();
        while(list.hasNext()){
            System.out.print(list.next()+" ");
        }
    }
}
