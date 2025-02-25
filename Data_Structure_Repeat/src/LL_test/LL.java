package LL_test;

public class LL
{
    private Node head;
    private Node tail;

    private int size;
    public LL()
    {
        this.size = 0;
    }

    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null)
        {
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int value)
    {
//        Node node = tail;
//        while(node.next != null)
//        {
//            node = node.next;
//        }
//        node.next = new Node(value);
//        node.next.value = value;
//        size += 1;
        if(tail == null)
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void insert(int value, int index)
    {
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        if (index == size)
        {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1 ;
    }
    public int deleteFirst()
    {
        int value = head.value;
        head = head.next;
        if (head == null)
        {
            tail = null;
        }
        size -= 1;
        return value;
    }
    public Node get(int index)
    {
        Node node = head;
        for (int i = 0; i < index; i++)
        {
            node = head.next;
        }
        return node;
    }
    public int deleteLast()
    {
        if (size <= 1)
        {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    public int delete(int index)
    {
        if (index == 0)
        {
            return deleteLast();
        }
        Node prev = get(size-2);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }
    public Node find(int value)
    {
        Node node = head;
        while(node != null)
        {
            if(node.value == value)
            {
                return node;
            }
            node = node.next;
        }
        return node;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}
