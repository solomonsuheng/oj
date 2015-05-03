package CareerCup.Chapter2;

/**
 * Created by Suheng on 15/5/3.
 */

/**
 * You have two numbers represented by a linked list,
 * where each node contains a sin- gle digit. The digits are stored in reverse order,
 * such that the 1’s digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 */
public class problem_2_4 {
    public static void main(String[] args) {
        int[] num1 = {3, 1, 1};//the number list of the first Node
        int[] num2 = {5, 9, 2};//the number list ofthe second Node
        Node numNode1 = initNode(num1);
        Node numNode2 = initNode(num2);
        printNode(numNode1);//print the list of the first node;
        printNode(numNode2);//print the list of the second node;
        Node resultNode = add2Node(numNode1, numNode2);
        printNode(resultNode.next);

    }

    //add two nodelist
    public static Node add2Node(Node node1, Node node2) {
        Node resultNode = new Node(0);
        Node pointNode = resultNode;
        int nextStep = 0;//store the number of the stepin
        while (node1 != null || node2 != null) {
            nextStep = node1.data + node2.data + nextStep;
            Node temp = new Node(nextStep % 10);
            temp.next = null;
            pointNode.next = temp;
            pointNode = pointNode.next;
            nextStep = nextStep / 10;
            node1 = node1.next;
            node2 = node2.next;
        }

        return resultNode;
    }

    //print the node
    public static void printNode(Node node) {
        Node nodePointer = node;
        while (nodePointer != null) {
            System.out.print(nodePointer.data + "->");
            nodePointer = nodePointer.next;
        }

        System.out.println("null");
    }

    //init the node list
    private static Node initNode(int[] num) {
        if (num.length <= 0) {
            //there is no element to init the node
            return null;
        }
        Node head = new Node(num[0]);
        Node tempPointer = head;
        for (int i = 1; i < num.length; i++) {
            Node temp = new Node(num[i]);
            temp.next = null;
            tempPointer.next = temp;
            tempPointer = tempPointer.next;
        }

        return head;
    }
}
