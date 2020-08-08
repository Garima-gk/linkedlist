class MiddleNode 
{ 
    Node head;
    class Node 
    { 
        int dt; 
        Node next; 
        Node(int s) {
   dt = s;
  next = null; 
} 
    } 
}

public void insertAfter(Node prev, int new) 
{ 
   
    if (prev == null) 
    { 
        System.out.println(" Previous node cannot be null"); 
        return; 
    } 
   Node new_n = new Node(new);  
    new_n.next = prev.next; 
    prev.next = new_n; 
} 