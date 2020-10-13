class GfG
{
    static class Temp{
        Node r;
        int level;
        
        Temp(Node root, int k){
            r = root;
            level = k;
        }
    }
     void printKdistance(Node root, int k)
     {
         Queue<Temp> q = new LinkedList<Temp>();
         q.add(new Temp(root,0));
         
         while(!q.isEmpty()){
             Temp a = q.remove();
             
             if(a.level == k)
             {
                 System.out.print(a.r.data+" ");
             }
             if(a.r.left != null)q.add(new Temp(a.r.left, a.level +1));
             if(a.r.right != null)q.add(new Temp(a.r.right, a.level +1));
         }
     }
}
