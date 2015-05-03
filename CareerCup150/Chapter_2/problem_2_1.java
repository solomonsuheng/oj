package CareerCup.Chapter2;

import java.util.HashSet;

/**
 * Created by Suheng on 15/5/3.
 */
public class problem_2_1 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 2, 3, 3, 3, 3, 4, 5, 6, 7, 6, 5, 43, 4, 4};
        Node head = initNode(num);//init the node list
        printNodeByOrder(head);//print the node
        removeDuplicateNode2(head);
        printNodeByOrder(head);
    }

    //without buffer, double pointer
    private static void removeDuplicateNode2(Node node) {
        Node temp1 = node;

        while (temp1 != null) {
            Node tempPior = temp1;
            Node temp2 = temp1.next;
            while (temp2 != null) {
                if (temp2.data == temp1.data) {
                    //the data has duplicate node, remove it
                    tempPior.next = temp2.next;
                    temp2 = temp2.next;
                } else {
                    temp2 = temp2.next;
                    tempPior = tempPior.next;
                }
            }
            temp1 = temp1.next;
        }

    }


    //use buffer, just like hashtable
    private static void removeDuplicateNode(Node node) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Node temp = node;
        Node temp2 = temp.next;
        hashSet.add(temp.data);
        while (temp2 != null) {
            if (hashSet.contains(temp2.data)) {
                //remove the data
                temp.next = temp2.next;
                temp2 = temp2.next;
            } else {
                hashSet.add(temp2.data);
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
    }

    //init the node list funciton
    private static Node initNode(int[] num) {
        //if empty return
        if (num.length <= 0) {
            return null;
        }
        Node head = new Node(num[0]);
        Node temp = head;
        for (int i = 1; i < num.length; i++) {
            Node newAlloc = new Node(num[i]);
            temp.next = newAlloc;
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //print the node list by order
    private static void printNodeByOrder(Node node) {
        Node temp = node;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
