package com.linklist;

public class LinkListMain
{
    Node head;

    public void pushAtFront(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void createLinkList(int data)
    {
        Node new_node = new Node(data);
        if(null == head)
        {
            head = new Node(data);
            return;
        }
        else{
            new_node.next = null;
            Node last = head;
            while (null != last.next)
            {
                last = last.next;
            }
            last.next = new_node;
            return;
        }
    }

    public void printTheLinkList()
    {
        Node current_node = head;
        while(current_node!= null)
        {
            System.out.println(current_node.data + " ");
            current_node = current_node.next;
        }
    }

    public static void main(String args[])
    {
        LinkListMain listMain = new LinkListMain();
        listMain.createLinkList(2);
        listMain.printTheLinkList();
        //listMain.pushAtFront(1);

    }
}
