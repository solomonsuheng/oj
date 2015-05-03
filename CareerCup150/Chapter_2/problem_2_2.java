package CareerCup.Chapter2;

/**
 * Created by Suheng on 15/5/3.
 */

//Implement an algorithm to find the nth to last element of a singly linked list.
public class problem_2_2 {
    public static void main(String[] args) {
        int[] num = {2, 3, 1, 1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1, 100};
        Node head = initNode(num);
        printNode(head);
        findTheNthElement(head, 10);
    }

    //find the nth to element
    private static void findTheNthElement(Node node, int nth) {

        //init two pointer, there are n distance between two pointer
        Node temp1 = node;
        Node temp2 = node;

        for (int i = 1; i < nth; i++) {
            temp2 = temp2.next;
        }

        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        System.out.println("The nth to the las element of a singly linked list is: " + temp1.data);
    }


    //init the node for the given num arrays
    private static Node initNode(int[] num) {
        if (num.length <= 0) {
            return null;//there is no number to you to init node;
        }
        Node head = new Node(num[0]);//init the first of the number arrays
        Node temp = head;//a temp pointer to point the head, which to use trail way to insert node
        //use a for loop to init the rest of the number arrays
        for (int i = 1; i < num.length; i++) {
            Node insertNode = new Node(num[i]);
            insertNode.next = null;
            temp.next = insertNode;
            temp = temp.next;
        }
        //return the head to the funciton called
        return head;
    }

    //function to print Node by order sort
    private static void printNode(Node node) {
        Node temp = node;

        //there are more than 1 elemnts in the node linkedlist
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
