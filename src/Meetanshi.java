class Node {
    int data;
    Node previous;
    Node next;
}
class DoublyLinkedList{
    Node head;
    public void insertAtLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            newnode.previous=temp;
            temp.next=newnode;

        }
    }
    public void deletionAtLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp=temp.previous;
            temp.next=null;

        }
    }
    public void insertionAtBeginning(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            newnode.previous=null;
        }
        else
        {

            Node temp=head;
            head=newnode;
            newnode.next=temp;
            newnode.previous=null;



        }
    }
    public void deletionAtBeginning()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            Node temp=head;
            head=temp.next;
            head.previous=null;
        }
    }
    public void insertAtAfternode(Node newnode,Node afternode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=afternode.next)
            {
                temp=temp.next;
            }

            newnode.next=temp.next;
            temp.next.previous=newnode;
            temp.next=newnode;
            newnode.previous=temp;
        }
    }
    public void deleteAfternode(Node afternode)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=afternode.next)
            {
                temp=temp.next;
            }
            if(temp.next==null)
            {
                System.out.println("nothing to delete");

            }
            else{
                temp.next=temp.next.next;
                temp.next.previous=temp;

            }
        }
    }

    public void insertBeforeNode(Node newnode,Node beforenode){
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=beforenode)
            {
                temp=temp.next;
            }
            newnode.next=temp.next;
            newnode.previous=temp;
            temp.next.previous=newnode;
            temp.next=newnode;


        }


    }
    public void deletebeforenode(Node beforenode)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=beforenode)
            {
                temp=temp.next;
            }
            if(temp==head)
            {
                head=head.next;
                head.previous=null;

            }
            else{
                temp=temp.previous;
                temp.next=temp.next.next;
                temp.next.previous=temp;
            }
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            System.out.println("My Doubly Linked List is : ");
            System.out.print("null"+"<---->");
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"<---->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[])
    {
        DoublyLinkedList obj= new DoublyLinkedList();
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();
        Node n5=new Node();
        Node n6=new Node();
        Node n7=new Node();
        Node n8=new Node();
        Node n9=new Node();
        Node n10=new Node();
        n1.data=100;
        n1.next=null;
        n1.previous=null;
        n2.data=200;
        n2.next=null;
        n2.previous=null;
        n3.data=300;
        n3.next=null;
        n3.previous=null;
        n4.data=400;
        n4.next=null;
        n4.previous=null;
        n5.data=500;
        n5.next=null;
        n5.previous=null;
        n6.data=600;
        n6.next=null;
        n6.previous=null;
        n7.data=700;
        n7.next=null;
        n7.previous=null;
        n8.data=800;
        n8.next=null;
        n8.previous=null;
        n9.data=900;
        n9.next=null;
        n9.previous=null;
        n10.data=1000;
        n10.next=null;
        n10.previous=null;
        obj.insertAtLast(n1);
        obj.insertAtLast(n2);
        obj.insertAtLast(n3);
        obj.insertAtLast(n4);
        obj.insertAtLast(n5);
        obj.insertAtLast(n6);
        obj.display();
        obj.insertionAtBeginning(n7);
        obj.insertionAtBeginning(n8);
        obj.display();
        obj.deletionAtLast();
        obj.display();
        obj.deletionAtBeginning();
        obj.display();
        obj.insertBeforeNode(n10,n4);
        obj.display();
        obj.deletebeforenode(n10);
        obj.display();
        obj.deleteAfternode(n1);
        obj.display();




    }
}