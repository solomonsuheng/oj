package CareerCup.Chapter2;

/**
 * Created by Suheng on 15/5/3.
 */


/**
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
 */
public class problem_2_3 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 5, 6};
        Node head = initNode(num);//init the node by given number arrays
        deleteTheMiddleOfASingleList(head);//delete the middle number
        printNode(head);//print the node list, which has been delete the middle number
    }

    //delete a node in the middle of a single linkedlist
    public static void deleteTheMiddleOfASingleList(Node node) {
        Node pointNode = node;
        int count = getCountOfLinkedList(node);//get the number of the count;
        count = count / 2;//get the middle number;
        for (int i = 1; i < count; i++) {
            System.out.println(pointNode.data);
            pointNode = pointNode.next;
        }
        //remove the middle number
        pointNode.next = pointNode.next.next;

    }

    //get the number of the linkedlist
    public static int getCountOfLinkedList(Node node) {
        int count = 0;
        Node pointNode = node;
        while (pointNode != null) {
            count++;
            pointNode = pointNode.next;
        }
        return count;
    }

    //init the init
    private static Node initNode(int[] num) {
        if (num.length <= 0) {
            return null;//there is no element to init, so return null to the called
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

    //print Node by order
    private static void printNode(Node node) {
        Node pointNode = node;
        while (pointNode != null) {
            System.out.print(pointNode.data + "->");
            pointNode = pointNode.next;
        }
        System.out.println("null");

    }
}
