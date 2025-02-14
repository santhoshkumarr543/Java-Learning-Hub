package LinkedList;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linklist
{
    Node head;
    public void insert(int data)
    {
        Node node = new Node(data);

        if(head == null) head = node;
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp.next != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public void reverse()
    {
        Node current = head;
        Node next = null;
        Node previous = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        Node temp = previous;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
public class Ll2 {
    public static void main(String[] args) {
        Linklist ls = new Linklist();
        ls.insert(15);
        ls.insert(16);
        ls.insert(17);
        ls.insert(18);

        ls.display();

        ls.reverse();
    }
}
