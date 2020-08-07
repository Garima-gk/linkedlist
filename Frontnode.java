class Frontnode 
{ 
    Node head;
    class Node 
    { 
        int dt; 
        Node next; 
     Node(int g) 
{
      dt = g;
     next = null;
 } 
    } 
}
public void push(int new_dt) 
{ 
    
    Node new_node = new Node(new_dt); 
    new_node.next = head; 
    head = new_node; 
} 