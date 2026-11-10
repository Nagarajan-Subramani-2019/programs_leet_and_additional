import org.w3c.dom.Node;

import javax.lang.model.type.NullType;
import java.util.Optional;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class linkedListManual {
    public static void main(String[] args) {
        System.out.println("hi");

        ListNode newnode1=new ListNode(1);    //here we are making objects of class Node
        ListNode newnode2=new ListNode(2);    //basically these are nodes of first linkedlist
        ListNode newnode3=new ListNode(3);
        ListNode newnode4=new ListNode(4);
        ListNode newnode5=new ListNode(5);

        newnode2.next=newnode3;       //here we are linking the previous node to the next node of the list
        newnode1.next=newnode2;
        newnode3.next=newnode4;
        newnode4.next=newnode5;
        newnode5.next=null;


        ListNode fSolution =newnode1;

        System.out.println();
        for (ListNode curr = fSolution; curr != null; curr = curr.next)
            System.out.print(curr.val + " ->() ");
        System.out.println();
        fSolution =removeNthFromEnd(newnode1,2);
        System.out.println();
        for (ListNode curr = fSolution; curr != null; curr = curr.next)
            System.out.print(curr.val + " ->() ");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");

        newnode1.next=newnode2;
        newnode2.next=null;


        System.out.println();
        for (ListNode curr = fSolution; curr != null; curr = curr.next)
            System.out.print(curr.val + " ->() ");
        System.out.println();
        fSolution =removeNthFromEnd(newnode1,1);
        System.out.println();
        for (ListNode curr = fSolution; curr != null; curr = curr.next)
            System.out.print(curr.val + " ->() ");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");

        newnode1=new ListNode(1);
        newnode1.next = null;

        System.out.println();
        for (ListNode curr = fSolution; curr != null; curr = curr.next)
            System.out.print(curr.val + " ->() ");
        System.out.println();
        fSolution =removeNthFromEnd(newnode1,1);
        System.out.println();
        for (ListNode curr = fSolution; curr != null; curr = curr.next)
            System.out.print(curr.val + " ->() ");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode SolutionNode = new ListNode(0);
        SolutionNode.next = head;
        ListNode lastNodeReference = SolutionNode;
        ListNode initialNodeReference = SolutionNode;

        //lastNodeReference-initialNodeReference will give n at any point of time .
        //To make that we are increasing the lastNodeReference alone to some extent which is again by using n
        //ListNode lastNodeReference=head;
        //ListNode initialNodeReference=head;

        if(lastNodeReference.next == null)
            if(n==1)
            {
                head=null;
                return head;
            }

        for (int i = 0; i <= n; i++)
lastNodeReference=lastNodeReference.next;


       while(lastNodeReference != null)
        {
            initialNodeReference=initialNodeReference.next;
            lastNodeReference=lastNodeReference.next;
        }

        initialNodeReference.next=initialNodeReference.next.next;

        return SolutionNode.next;
    }

}
