class Geeks
{
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
       list.add(x);
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
       Collections.sort(list);
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
     
        int flag = -1,index;
        index = Collections.binarySearch(list, val);
        if(index > 0)flag = 0;
            
        System.out.println(flag);
      
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        Collections.sort(list,Collections.reverseOrder());
    }

    public static void insert(ArrayList<Character> clist, char c)
    {
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
     
        if(clist.contains(c))
        System.out.println(Collections.frequency(clist,c));
        else
        System.out.println("Not Present");
        
    }
}
