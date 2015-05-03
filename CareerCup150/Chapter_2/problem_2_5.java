package CareerCup.Chapter2;

import java.util.HashSet;

/**
 * Created by Suheng on 15/5/3.
 */
public class problem_2_5 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 4};
        Node head = initNode(num);
        printNode(head);

        findTheloop(head);
    }

    //find the loop char
    private static void findTheloop(Node head) {
        Node tempNode = head;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int result = -1;
        while (tempNode != null) {
            if (hashSet.contains(tempNode.data)) {
                //have find the loop
                result = tempNode.data;
                break;
            } else {
                hashSet.add(tempNode.data);
                tempNode = tempNode.next;
            }
        }
        System.out.println("The loop char is: " + result);
    }

    //init the node list
    private static Node initNode(int[] num) {
        if (num.length <= 0) {
            return null;
        }
        Node head = new Node(num[0]);
        Node pointHead = head;
        for (int i = 1; i < num.length; i++) {
            Node temp = new Node(num[i]);
            temp.next = null;
            pointHead.next = temp;
            pointHead = pointHead.next;
        }
        return head;
    }

    //print the linkedList
    private static void printNode(Node head) {
        Node pointNode = head;
        while (pointNode != null) {
            System.out.print(pointNode.data + "->");
            pointNode = pointNode.next;
        }
        System.out.println("null");
    }
}
