public class linkedList {
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static linkedList insert(linkedList list, int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        if(list.head == null)
            list.head = newNode;
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
     public void printList()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
     public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("Enter how many values you want to store in the linked list");
        n = sc.nextInt();
        while(n!=0)
        {
            int data = sc.nextInt();
            list = insert(list, data);
            n--;
        }
	list.printList();
     }
}