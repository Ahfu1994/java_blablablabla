import java.awt.*;

public class LinkedList
{
    Node head;
    public LinkedList()
    {
        head = new Node();
    }
    public void addFirst(int x)
    {
        Node n = new Node();
        n.data = x;
        n.next = head.next;
        head.next = n;
    }
    public void addLast(int x)
    {
        Node n = head;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = new Node();
        n.next.data = x;
    }

    public void insertAt(int x, int index)
    {
        int k = 0;
        Node n = head;
        while(n.next != null && k< index)
        {
            n = n.next;
            k++;
        }
        Node m = n.next;
        n.next = new Node();
        n.next.data = x;
        n.next.next = m;
    }
    public void removeAt(int index)
    {
        int k = 0;
        Node n = head;
        while (n != null && k < index)
        {
            n = n.next;
            k++;
        }
        if (n.next == null)
        {
            return;
        }
        n.next = n.next.next;
    }
    public void draw(Graphics g)
    {
        int i = 0;
        Node n = head;
        Font fn = new Font("Serif", Font.BOLD, 20);
        while (n != null)
        {
            i++;
            //draw oval
            g.setColor(Color.BLACK);
            g.fillOval(50+60*i, 50 , 50+1, 50+1);
            g.setColor(Color.YELLOW);
            g.fillOval(50+60*i, 50 , 50, 50);

            //draw data
            g.setColor(Color.BLACK);
            g.setFont(fn);
            g.drawString(""+ n.data,40+60*i+28, 80);

            //draw line
            g.drawLine( 40+60*i+50, 55, 40+60*i+50,95);
            //draw arrow line
            g.drawLine( 40+60*i+50, 75, 50+60*(i+1),75);
            g.drawLine( 50+60*(i+1), 75, 50+60*(i+1)-5,65);
            g.drawLine( 50+60*(i+1), 75, 50+60*(i+1)-5,85);

            n = n.next;
        }
    }
}
